package com.codecool.myapp.controller;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@Configuration
@Controller
public class HttpRequestHandler {
    @RequestMapping(value={"/", "/home"})
    public String requestThatReturnsTemplate(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", myModel.valami);
        return "home"; // The name of the template
    }

    @RequestMapping("/hello")
    public String requestThatReturnsPemplate(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", myModel.valami);
        return "hello"; // The name of the template
    }

    @RequestMapping("/login")
    public String requestThatTeturnsPemplate(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", myModel.valami);
        return "login"; // The name of the template
    }

}
