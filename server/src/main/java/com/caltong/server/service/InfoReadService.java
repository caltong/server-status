package com.caltong.server.service;

import com.caltong.server.entity.ServerInfo;

import java.util.List;

public interface InfoReadService {
    List<ServerInfo> readServerInfoByServerId(Integer id, Integer startPage, Integer count);
}
