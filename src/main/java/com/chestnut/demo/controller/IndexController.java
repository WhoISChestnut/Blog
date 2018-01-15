package com.chestnut.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chestnut
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        System.out.println("index  ");
        return "index";
    }
}
