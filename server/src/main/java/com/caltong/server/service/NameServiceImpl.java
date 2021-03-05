package com.caltong.server.service;


import com.caltong.server.entity.Name;
import com.caltong.server.mapper.NameMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NameServiceImpl implements NameService {

    @Resource
    private NameMapper nameMapper;

    @Override
    public Name getById(Integer id) {
        return nameMapper.selectByPrimaryKey(id);
    }

    @Override
    public Name getByName(String name) {
        List<Name> nameList = nameMapper.selectByName(name);
        if (nameList.size() == 0) {
            return null;
        } else {
            return nameList.get(0);
        }
    }

    @Override
    public Integer insert(String name) {
        Name name1 = new Name();
        name1.setName(name);
        nameMapper.insert(name1);
        Integer id = name1.getId();
        return id;
    }
}
