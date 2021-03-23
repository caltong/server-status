package com.caltong.server.mapper;

import com.caltong.server.entity.Disk;

public interface DiskMapper {
    int deleteByPrimaryKey(Integer incId);

    int insert(Disk record);
}