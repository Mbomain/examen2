package com.example.demo.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

@RestController
public class Stored {

    @GetMapping("/stored-int")
    public int stored() {
        Path filePath = Path.of(System.getProperty("java.io.tmpdir"), "stored-int.txt");
        int number;
        try {
            if (Files.exists(filePath)) {
                String content = Files.readString(filePath).trim();
                number = Integer.parseInt(content);
            } else {
                number = new Random().nextInt();
                Files.writeString(filePath, String.valueOf(number));
            }
        } catch (IOException e) {
            number = new Random().nextInt();
        }
        return number;
    }
}
