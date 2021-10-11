package com.dh.flogao.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/posts")
public class FlogaoController {
    @GetMapping
    public String getPosts() {
        return "Jaja eu posto pera ai";
    }

}
