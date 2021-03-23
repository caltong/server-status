package com.caltong.client.service;

import org.springframework.stereotype.Service;
import oshi.SystemInfo;
import oshi.hardware.HWDiskStore;

import java.io.File;
import java.util.List;

@Service
public class DiskServiceImpl implements DiskService {
    //oshi查看的硬盘是物理硬盘 并且只能查看物理磁盘的总大小 无法查看使用和空余空间大小
    //File查看的是所有硬盘包括网络挂载
    @Override
    public int getTotal() {
        File[] files = File.listRoots();
        int total = 0;
        for (File file : files) {
            total += file.getTotalSpace() / 1024 / 1024 / 1024;
        }
        return total;
    }

    @Override
    public int getAvailable() {
        File[] files = File.listRoots();
        int available = 0;
        for (File file : files) {
            available += file.getFreeSpace() / 1024 / 1024 / 1024;
        }
        return available;
    }
}
