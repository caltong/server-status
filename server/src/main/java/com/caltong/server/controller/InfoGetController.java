package com.caltong.server.controller;

import com.caltong.server.entity.*;
import com.caltong.server.service.InfoReadService;
import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class InfoGetController {
    @Resource
    InfoReadService infoReadServiceImpl;

    @GetMapping("cpu")
    public ResponseEntity<List<CPU>> getCPU(Integer id, Integer startPage, Integer count) {
        List<CPU> cpuList = infoReadServiceImpl.readCPUInfoById(id, startPage, count);
        return ResponseEntity.ok(cpuList);
    }

    @GetMapping("disk")
    public ResponseEntity<List<Disk>> getDisk(Integer id, Integer startPage, Integer count) {
        List<Disk> diskList = infoReadServiceImpl.readDiskInfoById(id, startPage, count);
        return ResponseEntity.ok(diskList);
    }

    @GetMapping("memory")
    public ResponseEntity<List<Memory>> getMemory(Integer id, Integer startPage, Integer count) {
        List<Memory> memoryList = infoReadServiceImpl.readMemoryInfoById(id, startPage, count);
        return ResponseEntity.ok(memoryList);
    }

    @GetMapping("network")
    public ResponseEntity<List<Network>> getNetwork(Integer id, Integer startPage, Integer count) {
        List<Network> networkList = infoReadServiceImpl.readNetworkInfoById(id, startPage, count);
        return ResponseEntity.ok(networkList);
    }

    @GetMapping("name")
    public ResponseEntity<List<Name>> getAllName() {
        List<Name> nameList = infoReadServiceImpl.readAllName(1, 5);
        return ResponseEntity.ok(nameList);
    }
}
