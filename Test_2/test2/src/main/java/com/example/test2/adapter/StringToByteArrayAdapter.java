package com.example.test2.adapter;


import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@Component
public class StringToByteArrayAdapter {
    Charset charset = StandardCharsets.UTF_8;

    public byte[] convertToByteArray(String input) {
        return input.getBytes(charset);
    }

    public String convertToString(byte[] byteArray) {
        return new String(byteArray, charset);
    }

}
