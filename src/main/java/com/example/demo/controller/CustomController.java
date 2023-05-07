package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
@RequestMapping("/")
public class CustomController {

    @GetMapping
    public String get1() throws IOException {
        byte[] bytes = Files.readAllBytes(Path.of("CustomFolder/txtFile.txt"));
        String s = new String(bytes);

        return s;
    }

}
