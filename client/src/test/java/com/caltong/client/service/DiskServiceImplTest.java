package com.caltong.client.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DiskServiceImplTest {
    @Resource
    DiskService diskService;

    @Test
    void getTotal() {
        int total = diskService.getTotal();
        System.out.println(total + "GB");
    }

    @Test
    void getAvailable() {
        int available = diskService.getAvailable();
        System.out.println(available + "GB");
    }
}