package com.develhope.proveSpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public class NameService {

    public String reverseString(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        return new StringBuilder(name).reverse().toString();
    }
}