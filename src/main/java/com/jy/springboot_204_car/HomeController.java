package com.jy.springboot_204_car;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {

    @GetMapping("/carform")
    public String loadTvForm(Model model)
    {
        model.addAttribute("car",new Car());
        return "carform";
    }

    @PostMapping("/carform")
    public String processTvForm(@Valid Car car, BindingResult result)
    {
        if(result.hasErrors()){
            return "carform";
        }
        return "carconfirm";
    }
}