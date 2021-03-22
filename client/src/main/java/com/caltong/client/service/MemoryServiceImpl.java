package com.caltong.client.service;

import org.springframework.stereotype.Service;
import oshi.SystemInfo;

@Service
public class MemoryServiceImpl implements MemoryService {

    @Override
    public int getTotal() {
        SystemInfo systemInfo = new SystemInfo();
        long total = systemInfo.getHardware().getMemory().getTotal();
        return (int) (total / 1024 / 1024);
    }

    @Override
    public int getAvailable() {
        SystemInfo systemInfo = new SystemInfo();
        long available = systemInfo.getHardware().getMemory().getAvailable();
        return (int) (available/1024/1024);
    }
}
