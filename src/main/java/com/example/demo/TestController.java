package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by anyauh
 * Date 2018-02-02
 */
@Controller
public class TestController {
    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "Hello spring Boot first";
    }


    @GetMapping("test")
    public String test(Map<String,String> map){
        map.put("test","fjeifjeifjeifjeifjei");
        return "/index";
    }
}
