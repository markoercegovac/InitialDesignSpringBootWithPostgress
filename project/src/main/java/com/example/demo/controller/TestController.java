package com.example.demo.controller;

import com.example.demo.service.FooService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@RequiredArgsConstructor
public class TestController {

    private final FooService fooService;

    @GetMapping("/test")
    public void test(){
        fooService.test();
    }
}
