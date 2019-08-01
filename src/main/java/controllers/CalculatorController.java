package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
@RequestMapping("/calculate")
    public String calculate(@RequestParam(name = "firstNumber",required = false,defaultValue = "0") double firstNumber,
                            @RequestParam(name = "secondNumber",required = false,defaultValue = "0") double secondNumber,
                            @RequestParam(name ="operator",required = false,defaultValue = "Add") String operator , ModelMap model){
    double result = 0;
    switch (operator){
        case "Add":
            result = firstNumber + secondNumber;
            break;
        case "Substract":
            result = firstNumber - secondNumber;
            break;
        case "Multiply":
            result = firstNumber * secondNumber;
            break;
        case "Divide":
            result = firstNumber / secondNumber;
            break;
    }
    model.addAttribute("result", result);
    model.addAttribute("firstNumber",firstNumber);
    model.addAttribute("secondNumber",secondNumber);
    return "index";

}
}
