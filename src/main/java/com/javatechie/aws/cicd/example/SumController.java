package com.javatechie.aws.cicd.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumController {
    @GetMapping("/sum")
    public String calculateSum(
            @RequestParam(name = "num1") int num1,
            @RequestParam(name = "num2") int num2,
            Model model
    ) {
        int sum = num1 + num2;
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("sum", sum);
        return "sumResult"; // Return the name of the HTML template
    }
}
