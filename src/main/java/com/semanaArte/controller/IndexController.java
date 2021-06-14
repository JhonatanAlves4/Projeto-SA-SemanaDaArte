package com.semanaArte.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
    @GetMapping(value = "/", produces = "application/json")
    public String index(){
        return "AEEE!";
    }
}
