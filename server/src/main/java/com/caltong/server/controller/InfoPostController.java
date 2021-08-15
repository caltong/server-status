package com.caltong.server.controller;


import entity.ServerInfo;
import com.caltong.server.service.InfoWriteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class InfoPostController {
    @Resource
    InfoWriteService infoWriteService;

    @PostMapping("postInfo")
    public ResponseEntity<String> infoWriteController(@RequestBody ServerInfo serverInfo) {
        infoWriteService.writeServerInfo(serverInfo);
        return ResponseEntity.ok("ok");
    }
}
