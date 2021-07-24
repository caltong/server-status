package com.caltong.client.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles({"test"})
class CPUServiceImplTest {
    @Resource
    CPUService cpuService;

    @Test
    void getCurrentLoad() {
        for (int i = 0; i < 10; i++) {
            double currentLoad = cpuService.getCurrentLoad();
            System.out.println(currentLoad);
            currentLoad = cpuService.getCurrentLoad();
            System.out.println(currentLoad);
        }
    }

    @Test
    void getAverageLoad1() {
        double averageLoad1 = cpuService.getAverageLoad1();
        System.out.println(averageLoad1);

    }

    @Test
    void getAverageLoad5() {
        double averageLoad5 = cpuService.getAverageLoad5();
        System.out.println(averageLoad5);
    }

    @Test
    void getAverageLoad15() {
        double averageLoad15 = cpuService.getAverageLoad15();
        System.out.println(averageLoad15);
    }

    @Test
    void getCurrentTemperature() {
        double currentTemperature = cpuService.getCurrentTemperature();
        System.out.println(currentTemperature);
    }
}