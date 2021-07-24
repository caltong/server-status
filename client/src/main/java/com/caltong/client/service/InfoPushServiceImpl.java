package com.caltong.client.service;

import com.caltong.client.entity.ServerInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Profile({"production"})
@Service
@EnableScheduling
public class InfoPushServiceImpl implements InfoPushService {
    @Resource
    InfoReadService infoReadService;

    @Value("${server.url}")
    String url;

    @Override
    @Scheduled(cron = "${server.cron}")
    public void pushInfo2Server() {
        ServerInfo serverInfo = infoReadService.readServerInfo();
        System.out.println(serverInfo);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity(url, serverInfo, String.class);
        String body = stringResponseEntity.getBody();
        System.out.println(body);
    }
}
