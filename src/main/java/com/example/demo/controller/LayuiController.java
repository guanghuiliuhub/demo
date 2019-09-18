package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LayuiController {
	@RequestMapping("/index")
    public String demo() {
        return "html/index";
    }
	@RequestMapping("/about")
    public String getAbout() {
        return "html/about";
    }

}