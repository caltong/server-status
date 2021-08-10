package com.caltong.server.service;

import com.caltong.server.entity.*;

import java.util.List;

public interface InfoReadService {
    List<ServerInfo> readServerInfoByServerId(Integer id, Integer startPage, Integer count);

    List<Name> readAllName(Integer startPage, Integer count);

    List<CPU> readCPUInfoById(Integer id, Integer startPage, Integer count);

    List<Disk> readDiskInfoById(Integer id, Integer startPage, Integer count);

    List<Memory> readMemoryInfoById(Integer id, Integer startPage, Integer count);

    List<Network> readNetworkInfoById(Integer id, Integer startPage, Integer count);
}
