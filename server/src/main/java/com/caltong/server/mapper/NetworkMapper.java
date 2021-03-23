package com.caltong.server.mapper;

import com.caltong.server.entity.Network;

public interface NetworkMapper {
    int deleteByPrimaryKey(Integer incId);

    int insert(Network record);
}