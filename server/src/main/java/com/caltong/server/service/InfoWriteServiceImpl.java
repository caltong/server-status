package com.caltong.server.service;

import com.caltong.server.entity.*;
import com.caltong.server.mapper.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.nio.ch.Net;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Service
public class InfoWriteServiceImpl implements InfoWriteService {

    @Resource
    NameMapper nameMapper;
    @Resource
    CPUMapper cpuMapper;
    @Resource
    MemoryMapper memoryMapper;
    @Resource
    DiskMapper diskMapper;
    @Resource
    NetworkMapper networkMapper;

    @Override
    @Transactional
    public void writeServerInfo(ServerInfo serverInfo) {
        List<Name> nameList = nameMapper.selectByName(serverInfo.getName().getName());
        if (nameList.size() == 0) {
            nameMapper.insert(serverInfo.getName());
        }
        nameList = nameMapper.selectByName(serverInfo.getName().getName());
        if (nameList.size() == 1) {
            Name name = nameList.get(0);
            //设置cpu
            CPU cpu = serverInfo.getCpu();
            cpu.setId(name.getId());
            if (cpu.getTime() == null) {
                cpu.setTime(new Date());
            }
            cpuMapper.insert(cpu);
            //设置memory
            Memory memory = serverInfo.getMemory();
            memory.setId(name.getId());
            if (memory.getTime() == null) {
                memory.setTime(new Date());
            }
            memoryMapper.insert(memory);
            //设置disk
            Disk disk = serverInfo.getDisk();
            disk.setId(name.getId());
            if (disk.getTime() == null) {
                disk.setTime(new Date());
            }
            diskMapper.insert(disk);
            //设置network
            Network network = serverInfo.getNetwork();
            network.setId(name.getId());
            if (network.getTime() == null) {
                network.setTime(new Date());
            }
            networkMapper.insert(network);
        }
    }
}
