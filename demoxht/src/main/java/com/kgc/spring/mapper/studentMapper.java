package com.kgc.spring.mapper;

import com.kgc.spring.entity.student;
import com.kgc.spring.entity.studentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface studentMapper {
    int countByExample(studentExample example);

    int deleteByExample(studentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(student record);

    int insertSelective(student record);

    List<student> selectByExample(studentExample example);

    student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") student record, @Param("example") studentExample example);

    int updateByExample(@Param("record") student record, @Param("example") studentExample example);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
}