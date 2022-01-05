package com.demo.mapper;

import com.demo.entity.Readme;

public interface ReadmeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Readme record);

    int insertSelective(Readme record);

    Readme selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Readme record);

    int updateByPrimaryKeyWithBLOBs(Readme record);
}