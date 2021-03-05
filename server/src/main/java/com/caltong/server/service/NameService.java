package com.caltong.server.service;

import com.caltong.server.entity.Name;

public interface NameService {
    Name getById(Integer id);

    Name getByName(String name);

    Integer insert(String name);
}
