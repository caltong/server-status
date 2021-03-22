package com.caltong.client.service;

import com.caltong.client.entity.CPU;
import com.caltong.client.entity.Name;
import com.caltong.client.entity.ServerInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class InfoReadServiceImpl implements InfoReadService {

    @Resource
    CPUService cpuService;
    @Resource
    Name name;

    @Override
    public ServerInfo readServerInfo() {

        ServerInfo serverInfo = new ServerInfo();
        //读取cpu信息
        CPU cpu = new CPU();
        cpu.setCurrentLoad(cpuService.getCurrentLoad());
        cpu.setAverageLoad1(cpuService.getAverageLoad1());
        cpu.setAverageLoad5(cpuService.getAverageLoad5());
        cpu.setAverageLoad15(cpuService.getAverageLoad15());
        cpu.setCurrentTemperature(-1.0);
        cpu.setTime(new Date());
        serverInfo.setCpu(cpu);

        //读取Name配置文件
        serverInfo.setName(name);

        return serverInfo;
    }
}
