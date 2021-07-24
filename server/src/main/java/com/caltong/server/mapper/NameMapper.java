package com.caltong.server.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.caltong.server.entity.Name;
import org.springframework.stereotype.Repository;

@Mapper
public interface NameMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Name record);

    int insertSelective(Name record);

    Name selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Name record);

    int updateByPrimaryKey(Name record);

    List<Name> selectByName(@Param("name") String name);

    List<Name> selectOrderById();
}