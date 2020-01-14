package com.lit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lit
 * @date 2020/1/11 10:16:48
 */
@RestController
public class DemoController {

    @RequestMapping("/my")
    public String my(){
        return "springboot 访问成功";
    }

}
