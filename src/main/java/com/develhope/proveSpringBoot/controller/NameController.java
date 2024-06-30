package com.develhope.proveSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.develhope.proveSpringBoot.service.NameService;

@RestController
@RequestMapping("/")
public class NameController {

    @Autowired
    NameService nameService;

    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/reverseName")
    public String reverseName(@RequestBody String name) {
        return nameService.reverseString(name);
    }
}