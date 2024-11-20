package com.example.Conditioner2Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.stream.Collectors;

@Controller
public class CondeiController {
    @Autowired
    CondeiService condeiService;

    @GetMapping("/")
    public String index(){
        return "AirConditioningControl";
    }

    @GetMapping("/temperature")
    public String calc_temp(String t_r, String t_c, String mode, Model model){
        try{
            int temp_room = Integer.parseInt(t_r);
            int temp_cond = Integer.parseInt(t_c);
            Conditioner c = new Conditioner(temp_room,temp_cond, mode);
            model.addAttribute("temp_required", c.getResultTemp());
            condeiService.add(c);
        } catch (Exception e){
            System.out.println(e.getMessage());
            model.addAttribute("mistake");
        }
        return "AirConditioningControl";
    }

    @GetMapping("/history")
    public String showHistory(Model m){
        m.addAttribute("message",
                condeiService.getConditioner());
        return "AirConditioningControl";
    }
}
