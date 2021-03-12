package com.caltong.client.service;

import com.caltong.client.entity.CPU;
import com.caltong.client.entity.ServerInfo;
import oshi.SystemInfo;

import javax.annotation.Resource;

public class InfoReadServiceImpl implements InfoReadService {

    @Resource
    CPUService cpuService;

    @Override
    public ServerInfo readServerInfo() {

        ServerInfo serverInfo = new ServerInfo();
        //读取cpu信息
        CPU cpu = new CPU();
        cpu.setCurrentLoad(cpuService.getCurrentLoad());
        cpu.setAverageLoad1(cpuService.getAverageLoad1());
        cpu.setAverageLoad5(cpuService.getAverageLoad5());


        serverInfo.setCpu(cpu);
        return null;
    }
}
