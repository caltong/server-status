package com.caltong.server.mapper;

import org.apache.ibatis.annotations.Param;

import entity.Disk;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiskMapper {
    int deleteByPrimaryKey(Integer incId);

    int insert(Disk record);

    List<Disk> selectAllByIdOrderByTimeDesc(@Param("id") Integer id);


}