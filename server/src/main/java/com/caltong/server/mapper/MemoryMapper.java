package com.caltong.server.mapper;

import org.apache.ibatis.annotations.Param;

import com.caltong.server.entity.Memory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoryMapper {
    int deleteByPrimaryKey(Integer incId);

    int insert(Memory record);

    List<Memory> selectAllByIdOrderByTimeDesc(@Param("id") Integer id);


}