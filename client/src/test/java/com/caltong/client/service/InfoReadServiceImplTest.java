package com.caltong.client.service;

import entity.ServerInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InfoReadServiceImplTest {
    @Resource
    InfoReadService infoReadService;

    @Test
    void readServerInfo() {
        ServerInfo serverInfo = infoReadService.readServerInfo();
        System.out.println(serverInfo);
    }
}