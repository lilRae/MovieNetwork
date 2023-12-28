package com.example.demo;

import com.example.demo.mapper.UsrMapper;
import com.example.demo.usr.Usr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo2Application.class, args);
    }

}
