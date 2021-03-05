package com.caltong.server.service;

import com.caltong.server.entity.CPU;
import com.caltong.server.mapper.CPUMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CPUServiceImpl implements CPUService {

    @Resource
    CPUMapper cpuMapper;

    @Override
    public Integer insert(CPU cpu) {
        cpuMapper.insert(cpu);
        return cpu.getIncId();
    }

    @Override
    public List<CPU> getById(Integer id, Integer startPage, Integer count) {
        PageHelper.startPage(startPage, count);
        List<CPU> cpuList = cpuMapper.selectAllByIdOrderByTimeDesc(id);
        return cpuList;
    }
}
