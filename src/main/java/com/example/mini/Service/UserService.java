package com.example.mini.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipayEncrypt;
import com.alipay.api.internal.util.AlipaySignature;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Service
public class UserService {

    public JSONObject Decryptphone(JSONObject jsonObject) throws Exception {
        String response = jsonObject.toString();
        System.out.println(response);
        //1. 获取验签和解密所需要的参数
        Map<String, String> openapiResult = JSON.parseObject(response,new TypeReference<Map<String, String>>() {}, Feature.OrderedField);
        System.out.println(openapiResult);
        String signType = "RSA2";
        String charset = "UTF-8";
        String encryptType = "AES";
        String sign = openapiResult.get("sign");
        String content = openapiResult.get("response");
        //判断是否为加密内容
        boolean isDataEncrypted = !content.startsWith("{");
        boolean signCheckPass = false;
        //2. 验签
        String signContent = content;
        String signVeriKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAr+14j5Ot1aRNWu7Ax6RjOU1v+esA1iheEj0Aw/eZiHePhCG/zA8duPK1JzrNerVz6HVd7IfgX6dkAFcSLtNpjf92C86F/f1SFo5D2TgjTd9TP4CGptMdNRvzCqzbc5H3mFAsUs2xWYDeRKyjHo5Rn7cYuA7YkouL9Af221I+iZZMhEqfIgDYYwOpn7z6WpRMv9Ho4bdexOZ+6MmXODf76fFZ3LK+Lro7up38P4fjabrtUl9vJfX6DGbZzjBhVaFO1/XiHPvkYUEVzWROiZaZzvauER+ijTOEHM2R+yqcAaI0WJqwdCV9G/zcL+uYXU0jqaMDUaUdQ80SqneriidJ+wIDAQAB";
        String decryptKey = "ubpYD2wRklVThMgUXx8yWQ==";//如果是加密的报文则需要在密文的前后添加双引号
        if (isDataEncrypted) {
            signContent = "\"" + signContent + "\"";
        } try {
            signCheckPass = AlipaySignature.rsaCheck(signContent, sign, signVeriKey, charset, signType);
            System.out.println(signCheckPass);
        } catch (AlipayApiException e) {
            // 验签异常, 日志
        } if (!signCheckPass) {
            //验签不通过（异常或者报文被篡改），终止流程（不需要做解密）
            throw new Exception("验签失败");
        }
        //3. 解密
        String plainData = null;
        if (isDataEncrypted) {
            try {
                plainData = AlipayEncrypt.decryptContent(content, encryptType, decryptKey, charset);
                System.out.println(plainData);
            } catch (AlipayApiException e) {
                //解密异常, 记录日志
                throw new Exception("解密异常");
            }} else {
            plainData = content;
        }
        JSONObject jsonObject1 =  JSON.parseObject(plainData);

        return jsonObject1;
    }
}
