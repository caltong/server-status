package com.caltong.server.service;

import com.caltong.server.entity.CPU;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CPUServiceImplTest {

    @Resource
    CPUService cpuServiceImpl;

    @Test
    void insert() {
        CPU cpu = new CPU();
        cpu.setId(1);
        cpu.setCurrentLoad(0.0);
        cpu.setAverageLoad1(0.0);
        cpu.setAverageLoad5(0.0);
        cpu.setAverageLoad15(0.0);
        cpu.setCurrentTemperature(0.0);
        cpu.setTime(new Date());
        Integer inc_id = cpuServiceImpl.insert(cpu);
        System.out.println(inc_id);
    }

    @Test
    void getById() {
        List<CPU> cpuList = cpuServiceImpl.getById(1, 1, 2);
        for (CPU cpu : cpuList) {
            System.out.println(cpu);
        }
    }
}