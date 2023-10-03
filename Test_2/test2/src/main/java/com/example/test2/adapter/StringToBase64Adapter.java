package com.example.test2.adapter;

import org.springframework.stereotype.Component;

import java.util.Base64;
@Component
public class StringToBase64Adapter {
    public String convertToBase64(String input) {
        byte[] bytes = input.getBytes();
        byte[] base64Bytes = Base64.getEncoder().encode(bytes);
        return new String(base64Bytes);
    }

    public String convertToString(String base64) {
        byte[] base64Bytes = base64.getBytes();
        byte[] bytes = Base64.getDecoder().decode(base64Bytes);
        return new String(bytes);
    }
}
