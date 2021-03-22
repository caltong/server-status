package com.caltong.client.entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NameTest {
    @Resource
    Name name;

    @Test
    void getPropertiesName() {
        System.out.println(name.getName());
    }
}