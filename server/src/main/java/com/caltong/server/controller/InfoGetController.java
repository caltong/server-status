package com.caltong.server.controller;

import com.caltong.server.entity.Name;
import com.caltong.server.entity.ServerInfo;
import com.caltong.server.service.InfoReadService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class InfoGetController {
    @Resource
    InfoReadService infoReadServiceImpl;

    @GetMapping("info")
    public ResponseEntity<List<ServerInfo>> getByName(Integer id, Integer startPage, Integer count) {
        List<ServerInfo> serverInfoList = infoReadServiceImpl.readServerInfoByServerId(id, startPage, count);
        return ResponseEntity.ok(serverInfoList);
    }

    @GetMapping("name")
    public ResponseEntity<List<Name>> getAllName() {
        List<Name> nameList = infoReadServiceImpl.readAllName(1, 5);
        return ResponseEntity.ok(nameList);
    }
}
