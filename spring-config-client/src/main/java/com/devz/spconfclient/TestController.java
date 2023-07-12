package com.devz.spconfclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DbSettings dbSettings;

    @GetMapping("/")
    public String getConfig(){
        System.out.println(">>getConfig");
        return dbSettings.getConnection();
    }
}
