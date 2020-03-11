package com.itheima.controller;

import com.controller.MySpringBootController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author : 顾兆远
 * @program: chapter001
 * @description: 单元测试
 * @date : 2020-03-09 10:37
 **/

@SpringBootTest
public class MySpringBootControllerTest {
    @Autowired
    private MySpringBootController controller;
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }
    @Test
    public void testHello() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders
                .get("/springWeb/hello")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .string("Hello,Spring Boot!"));
    }
}
