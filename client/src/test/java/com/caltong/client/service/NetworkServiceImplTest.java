package com.caltong.client.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class NetworkServiceImplTest {
    @Resource
    NetworkService networkService;

    @Test
    void getIn() {
        for (int i = 0; i < 20; i++) {
            double in = networkService.getIn();
            System.out.println(in);
        }
    }

    @Test
    void getOut() {
        for (int i = 0; i < 20; i++) {
            double out = networkService.getOut();
            System.out.println(out);
        }
    }
}