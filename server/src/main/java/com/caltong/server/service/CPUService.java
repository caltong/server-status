package com.caltong.server.service;


import com.caltong.server.entity.CPU;

import java.util.List;

public interface CPUService {
    Integer insert(CPU cpu);

    List<CPU> getById(Integer id,Integer startPage,Integer count);
}
