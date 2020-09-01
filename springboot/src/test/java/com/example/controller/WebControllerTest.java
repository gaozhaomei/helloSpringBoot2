package com.example.controller;


import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


public class WebControllerTest {
    private MockMvc mockMvc;
    @Before
    public void setUp(){
        mockMvc=MockMvcBuilders.standaloneSetup(new WebController()).build();
    }
    @Test
    public void getUserTest() throws Exception {
        String reponseString=mockMvc.perform(MockMvcRequestBuilders.post("/web/getUser").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andReturn().getResponse().getContentAsString();
        System.out.println("result:"+reponseString);
    }
}
