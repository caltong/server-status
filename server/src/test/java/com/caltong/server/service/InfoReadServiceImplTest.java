package com.caltong.server.service;

import com.caltong.server.entity.Name;
import com.caltong.server.entity.ServerInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InfoReadServiceImplTest {
    @Resource
    InfoReadService infoReadService;

    @Test
    void readServerInfoByServerId() {
        List<ServerInfo> serverInfoList = infoReadService.readServerInfoByServerId(12, 1, 3);
        for (ServerInfo serverInfo : serverInfoList) {
            System.out.println(serverInfo.toString());
        }
    }

    @Test
    void readAllName() {
        List<Name> nameList = infoReadService.readAllName(1, 5);
        for (Name name : nameList) {
            System.out.println(name.toString());
        }
    }
}