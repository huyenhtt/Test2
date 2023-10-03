package com.example.test2.controller;

import com.example.test2.adapter.StringToBase64Adapter;
import com.example.test2.adapter.StringToByteArrayAdapter;
import com.example.test2.adapter.StringToHexAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins ="http://localhost:4200/")
@RequestMapping("/api/conversion")
public class ConversionController {
    @Autowired
    private StringToHexAdapter stringToHexAdapter;
    @Autowired
    private StringToByteArrayAdapter stringToByteArrayAdapter;
    @Autowired
    private StringToBase64Adapter stringToBase64Adapter;

    @PostMapping("/string-to-hex")
    public String convertStringToHex(@RequestBody String input) {
        return stringToHexAdapter.convertToHex(input);
    }

    @PostMapping("/hex-to-string")
    public String convertHexToString(@RequestBody String input) {
        return stringToHexAdapter.convertToString(input);
    }


    @PostMapping("/string-to-base64")
    public String convertStringToBase64(@RequestBody String input) {
        return stringToBase64Adapter.convertToBase64(input);
    }

    @PostMapping("/base64-to-string")
    public String convertBase64ToString(@RequestBody String base64) {
        return stringToBase64Adapter.convertToString(base64);
    }

    @PostMapping("/string-to-byte-array")
    public byte[] convertStringToByteArray(@RequestBody String input) {
        return stringToByteArrayAdapter.convertToByteArray(input);
    }

    @PostMapping("/byte-array-to-string")
    public String convertByteArrayToString(@RequestBody byte[] byteArray) {
        return stringToByteArrayAdapter.convertToString(byteArray);
    }
}
