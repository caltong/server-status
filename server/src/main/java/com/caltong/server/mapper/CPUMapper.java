package com.caltong.server.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import entity.CPU;

import java.util.List;

@Mapper
public interface CPUMapper {
    int deleteByPrimaryKey(Integer incId);

    int insert(CPU record);

    List<CPU> findAllById(@Param("id") Integer id);

    List<CPU> selectAllByIdOrderByTimeDesc(@Param("id") Integer id);


}