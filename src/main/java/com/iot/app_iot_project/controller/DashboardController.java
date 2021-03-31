package com.iot.app_iot_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

    @RequestMapping("/")
    public String welcome() {
        return "dashboard";
    }

    @RequestMapping(value = "/login")
    public String index() {
        return "index";
    }
}
