package com.caltong.client.service;

import com.caltong.client.entity.ServerInfo;
import oshi.SystemInfo;

public class InfoReadServiceImpl implements InfoReadService {

    @Override
    public ServerInfo readServerInfo() {

        SystemInfo systemInfo = new SystemInfo();

        return null;
    }
}
