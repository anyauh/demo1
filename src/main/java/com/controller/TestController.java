package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by anyauh
 * Date 2018-02-02
 */
@Controller
public class TestController {
    @RequestMapping("index")
    public String index(){
        return "Hello spring Boot";

    }
}
