package com.example.test2.controller;

import com.example.test2.adapter.DataConverterAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataConversionController {

    @GetMapping("/")
    public String index() {
        return "convert";
    }

    @PostMapping("/convert")
    public String convert(
            @RequestParam String inputData,
            @RequestParam String inputType,
            @RequestParam String outputType,
            Model model) {

        DataConverterAdapter adapter = new DataConverterAdapter();
        String result = adapter.convert(inputData, inputType, outputType);

        model.addAttribute("inputData", inputData);
        model.addAttribute("outputData", result);
        model.addAttribute("inputType", inputType);
        model.addAttribute("outputType", outputType);

        return "convert";
    }
}
