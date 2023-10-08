package com.example.test2.adapter;

import org.apache.tomcat.util.codec.binary.Base64;

import java.util.Arrays;

public class DataConverterAdapter {
    public String convert(String inputData, String inputType, String outputType) {
        switch (inputType) {
            case "string":
                return convertFromString(inputData, outputType);
            case "base64":
                return convertFromBase64(inputData, outputType);
            case "hex":
                return convertFromHex(inputData, outputType);
            case "byte[]":
                return convertFromByteArray(inputData, outputType);
            default:
                return "Unsupported input type";
        }
    }

    private String convertFromString(String inputData, String outputType) {
        switch (outputType) {
            case "base64":
                // Chuyển đổi từ chuỗi sang base64
                byte[] bytes = inputData.getBytes();
                return Base64.encodeBase64String(bytes);
            case "hex":
                // Chuyển đổi từ chuỗi sang hex
                return stringToHex(inputData);
            case "byte[]":
                // Chuyển đổi từ chuỗi sang byte[]
                return Arrays.toString(inputData.getBytes());
            default:
                return "Unsupported output type";
        }
    }
    private String stringToHex(String input) {
        char[] chars = input.toCharArray();
        StringBuilder hex = new StringBuilder();
        for (char character : chars) {
            hex.append(Integer.toHexString((int) character));
        }
        return hex.toString();
    }

    private String convertFromBase64(String inputData, String outputType) {
        // Thực hiện chuyển đổi từ base64 đến các kiểu khác
        byte[] base64Bytes = Base64.decodeBase64(inputData);
        switch (outputType) {
            case "string":
                // Chuyển đổi từ base64 sang chuỗi
                return new String(base64Bytes);
            case "hex":
                // Chuyển đổi từ base64 sang hex
                return bytesToHex(base64Bytes);
            case "byte[]":
                // Chuyển đổi từ base64 sang byte[]
                return Arrays.toString(base64Bytes);
            default:
                return "Unsupported output type";
        }
    }

    private String convertFromHex(String inputData, String outputType) {
        // Thực hiện chuyển đổi từ hex đến các kiểu khác
        byte[] bytes = hexToBytes(inputData);
        switch (outputType) {
            case "string":
                // Chuyển đổi từ hex sang chuỗi
                return new String(bytes);
            case "base64":
                // Chuyển đổi từ hex sang base64
                return Base64.encodeBase64String(bytes);
            case "byte[]":
                // Chuyển đổi từ hex sang byte[]
                return Arrays.toString(bytes);
            default:
                return "Unsupported output type";
        }
    }

    private String convertFromByteArray(String inputData, String outputType) {
        byte[] byteArray = inputData.getBytes();
        switch (outputType) {
            case "string":
                // Chuyển đổi từ byte[] sang chuỗi
                return new String(byteArray);
            case "base64":
                // Chuyển đổi từ byte[] sang base64
                return Base64.encodeBase64String(byteArray);
            case "hex":
                // Chuyển đổi từ byte[] sang hex
                return bytesToHex(byteArray);
            default:
                return "Unsupported output type";
        }
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02X", b));
        }
        return result.toString();
    }

    private byte[] hexToBytes(String hex) {
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                    + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }
}
