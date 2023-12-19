package com.example.mini.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("chat_message")
public class ChatMessage {
    @TableField(value = "message_id")
    private int message_id;
    @TableField(value = "sender_user_id")
    private int sender_user_id;
    @TableField(value = "receiver_user_id")
    private int receiver_user_id;
    @TableField(value = "message_text")
    private String message_text;
    @TableField(value = "is_read")
    private boolean is_read;
    @TableField(value = "send_user_id",exist = false)
    private int user_id;
    @TableField(value = "rece_user_id",exist = false)
    private int rece_user_id;

    @Override
    public String toString() {
        return "ChatMessage{" +
                "message_id=" + message_id +
                ", sender_user_id=" + sender_user_id +
                ", receiver_user_id=" + receiver_user_id +
                ", message_text='" + message_text + '\'' +
                ", is_read=" + is_read +
                ", user_id=" + user_id +
                ", rece_user_id=" + rece_user_id +
                '}';
    }
}
