package com.caltong.client.service;

import com.caltong.client.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class InfoReadServiceImpl implements InfoReadService {

    @Resource
    CPUService cpuService;
    @Resource
    MemoryService memoryService;
    @Resource
    DiskService diskService;
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
        cpu.setCurrentTemperature(cpuService.getCurrentTemperature());
        cpu.setTime(new Date());
        serverInfo.setCpu(cpu);
        //读取内存信息
        Memory memory = new Memory();
        memory.setTotal(memoryService.getTotal());
        memory.setAvailable(memoryService.getAvailable());
        memory.setTime(new Date());
        serverInfo.setMemory(memory);
        //读取硬盘信息
        Disk disk = new Disk();
        disk.setTotal(diskService.getTotal());
        disk.setAvailable(diskService.getAvailable());
        disk.setTime(new Date());
        //读取网络信息

        //读取Name配置文件
        serverInfo.setName(name);

        return serverInfo;
    }
}
