package com.caltong.server.service;

import com.caltong.server.entity.CPU;
import com.caltong.server.entity.Name;
import com.caltong.server.entity.ServerInfo;
import com.caltong.server.mapper.CPUMapper;
import com.caltong.server.mapper.NameMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class InfoWriteServiceImpl implements InfoWriteService {

    @Resource
    NameMapper nameMapper;
    @Resource
    CPUMapper cpuMapper;

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
            CPU cpu = serverInfo.getCpu();
            cpu.setId(name.getId());
            if (cpu.getTime() == null) {
                cpu.setTime(new Date());
            }
            cpuMapper.insert(cpu);
        }
    }
}
