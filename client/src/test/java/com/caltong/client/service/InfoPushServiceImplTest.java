package com.caltong.client.service;

import com.caltong.client.entity.ServerInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InfoPushServiceImplTest {
    @Resource
    InfoPushService infoPushService;
    @Resource
    InfoReadService infoReadService;

    @Test
    void pushInfo2Server() {
//        ServerInfo serverInfo = infoReadService.readServerInfo();
        infoPushService.pushInfo2Server();
    }
}