package com.comp2411.dbms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("")
    public String showDashBoard(){
        return "dashboard";
    }
}
