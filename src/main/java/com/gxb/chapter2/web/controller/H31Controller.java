package com.gxb.chapter2.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/h31")
public class H31Controller {
    @RequestMapping(method = GET)
    public String home(Model model) {
        model.addAttribute("message","hello world test");
        return "bling";
    }
    @RequestMapping(value = "/other",method = GET)
    public String home2(Model model) {
        model.addAttribute("message","hello world function2");
        return "bling";
    }
}
