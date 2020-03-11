package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter001Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter001Application.class, args);

        //关闭
//        new SpringApplicationBuilder(Chapter001Application.class).bannerMode(Banner.Mode.OFF).run(args);
    }

}
