package com.caltong.client.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemoryServiceImplTest {
    @Resource
    MemoryService memoryService;

    @Test
    void getTotal() {
        int total = memoryService.getTotal();
        System.out.println(total);
    }

    @Test
    void getAvailable() {
        int available = memoryService.getAvailable();
        System.out.println(available);
    }
}