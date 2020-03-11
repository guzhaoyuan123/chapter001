package com.controller;


import com.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: chapter001
 * @description: Controller
 * @author: 顾远
 * @create: 2020-03-05 17:32
 **/
@RestController
public class HelloController {

    @Autowired
    private Book book;

    @GetMapping("/hello")
    public String hello(){
        return "hello spring Boot 12345789";
    }


    @GetMapping("/hello/{name}")
    public String hello(@PathVariable(value = "name") String name){
        return "Hello, "+ name;
    }


    @GetMapping("/book")
    public String getBook(){
        return book.toString();
    }
}
