package com.example.applicationProperties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Value("${summer.name}")
    private String name;

    @Test
    public void printProperties(){
            System.out.println("summer.name = " + name);
    }
}
