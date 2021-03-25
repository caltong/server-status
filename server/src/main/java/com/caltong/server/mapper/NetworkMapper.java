package com.caltong.server.mapper;

import org.apache.ibatis.annotations.Param;

import com.caltong.server.entity.Network;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NetworkMapper {
    int deleteByPrimaryKey(Integer incId);

    int insert(Network record);

    List<Network> selectAllByIdOrderByTimeDesc(@Param("id") Integer id);


}