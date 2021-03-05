package com.caltong.server.service;

import com.caltong.server.ServerApplication;
import com.caltong.server.entity.Name;
import org.assertj.core.internal.IterableElementComparisonStrategy;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class NameServiceImplTest {

    @Resource
    NameService nameServiceImpl;

    @Test
    void getById() {
        Name byId = nameServiceImpl.getById(1);
        System.out.println(byId);
    }

    @Test
    void getByName() {
        Name test = nameServiceImpl.getByName("test");
        System.out.println(test);
    }

    @Test
    void insert() {
        Integer id = nameServiceImpl.insert("test1");
        System.out.println(id);
    }
}