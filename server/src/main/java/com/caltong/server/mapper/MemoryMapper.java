package com.caltong.server.mapper;

import com.caltong.server.entity.Memory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemoryMapper {
    int deleteByPrimaryKey(Integer incId);

    int insert(Memory record);
}