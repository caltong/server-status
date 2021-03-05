package com.caltong.server.service;

import com.caltong.server.entity.CPU;
import com.caltong.server.entity.Name;
import com.caltong.server.entity.ServerInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class InfoReadServiceImpl implements InfoReadService {
    @Resource
    NameService nameServiceImpl;
    @Resource
    CPUService cpuServiceImpl;

    @Override
    public List<ServerInfo> readServerInfoByServerId(Integer id, Integer startPage, Integer count) {
        Name name = nameServiceImpl.getById(id);
        List<CPU> cpuList = cpuServiceImpl.getById(id, startPage, count);
        List<ServerInfo> serverInfoList = new ArrayList<>();
        for (int i = 0; i < cpuList.size(); i++) {
            ServerInfo serverInfo = new ServerInfo();
            serverInfo.setName(name);
            serverInfo.setCpu(cpuList.get(i));
            serverInfoList.add(serverInfo);
        }
        return serverInfoList;
    }
}
