package com.caltong.server.service;

import entity.*;
import com.caltong.server.mapper.*;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
public class InfoReadServiceImpl implements InfoReadService {
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
    public List<ServerInfo> readServerInfoByServerId(Integer id, Integer startPage, Integer count) {
        Name name = nameMapper.selectByPrimaryKey(id);
        PageHelper.startPage(startPage, count);
        List<CPU> cpuList = cpuMapper.selectAllByIdOrderByTimeDesc(id);
        PageHelper.startPage(startPage, count);
        List<Memory> memoryList = memoryMapper.selectAllByIdOrderByTimeDesc(id);
        PageHelper.startPage(startPage, count);
        List<Disk> diskList = diskMapper.selectAllByIdOrderByTimeDesc(id);
        PageHelper.startPage(startPage, count);
        List<Network> networkList = networkMapper.selectAllByIdOrderByTimeDesc(id);
        List<ServerInfo> serverInfoList = new ArrayList<>();
        for (int i = 0; i < cpuList.size(); i++) {
            ServerInfo serverInfo = new ServerInfo();
            serverInfo.setName(name);
            serverInfo.setCpu(cpuList.get(i));
            serverInfo.setMemory(memoryList.get(i));
            serverInfo.setDisk(diskList.get(i));
            serverInfo.setNetwork(networkList.get(i));
            serverInfoList.add(serverInfo);
        }
        return serverInfoList;
    }

    @Override
    public List<Name> readAllName(Integer startPage, Integer count) {
        PageHelper.startPage(startPage, count);
        return nameMapper.selectOrderById();
    }

    @Override
    public List<CPU> readCPUInfoById(Integer id, Integer startPage, Integer count) {
        PageHelper.startPage(startPage, count);
        return cpuMapper.selectAllByIdOrderByTimeDesc(id);
    }

    @Override
    public List<Disk> readDiskInfoById(Integer id, Integer startPage, Integer count) {
        PageHelper.startPage(startPage, count);
        return diskMapper.selectAllByIdOrderByTimeDesc(id);
    }

    @Override
    public List<Memory> readMemoryInfoById(Integer id, Integer startPage, Integer count) {
        PageHelper.startPage(startPage, count);
        return memoryMapper.selectAllByIdOrderByTimeDesc(id);
    }

    @Override
    public List<Network> readNetworkInfoById(Integer id, Integer startPage, Integer count) {
        PageHelper.startPage(startPage, count);
        return networkMapper.selectAllByIdOrderByTimeDesc(id);
    }


}
