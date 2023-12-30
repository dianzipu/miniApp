package com.example.mini.Controller;

import com.example.mini.Entity.ChatMessage;
import com.example.mini.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/message")
@RestController
public class MessageController {


    @Autowired
    private MessageService messageService;

    @PostMapping("/save")
    public ResponseEntity<ChatMessage> saveMessage(@RequestBody ChatMessage message) {
        try {
            messageService.save(message);
            return ResponseEntity.status(HttpStatus.CREATED).body(message);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/getAll")
    public List<ChatMessage> getAllMessages() {
        return messageService.findAll();
    }

    @GetMapping("/getMessage/{id}")
    public ResponseEntity<?> getMessageById(@PathVariable int id) {
        ChatMessage message = messageService.findById(id);
        if (message == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Message not found with ID: " + id);
        }
        return ResponseEntity.ok(message);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteMessage(@PathVariable int id) {
        if (!messageService.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Message not found with ID: " + id);
        }
        messageService.deleteById(id);
        return ResponseEntity.ok("Message deleted successfully");
    }
}
