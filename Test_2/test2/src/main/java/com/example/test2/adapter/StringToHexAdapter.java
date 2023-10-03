package com.example.test2.adapter;

import org.springframework.stereotype.Component;

@Component
public class StringToHexAdapter {
    public String convertToHex(String input) {
        StringBuilder hexStringBuilder = new StringBuilder();
        for (char character : input.toCharArray()) {
            String hexValue = Integer.toHexString(character);
            hexStringBuilder.append(hexValue);
        }
        return hexStringBuilder.toString();
    }

    public String convertToString(String hex) {
        StringBuilder stringStringBuilder = new StringBuilder();
        for (int i = 0; i < hex.length(); i += 2) {
            String hexValue = hex.substring(i, i + 2);
            int intValue = Integer.parseInt(hexValue, 16);
            stringStringBuilder.append((char) intValue);
        }
        return stringStringBuilder.toString();
    }
}
