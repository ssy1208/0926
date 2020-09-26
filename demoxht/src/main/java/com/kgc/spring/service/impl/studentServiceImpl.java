package com.kgc.spring.service.impl;

import com.kgc.spring.entity.student;
import com.kgc.spring.entity.studentExample;
import com.kgc.spring.mapper.studentMapper;
import com.kgc.spring.service.studentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("studnetservice")
public class studentServiceImpl implements studentService {
    @Resource
    studentMapper studentMapper;
    @Override
    public List<student> select() {
        return studentMapper.selectByExample(null);
    }

    @Override
    public int add(student student) {

        return studentMapper.insert(student);
    }

    @Override
    public List<student> selectByExample(studentExample example) {
        return studentMapper.selectByExample(example);
    }

//    @Override
//    public List<student> selectBycha(int classid, String name) {
//        studentExample example=new studentExample();
//        studentExample.Criteria criteria = example.createCriteria();
//        if(classid==0 && name==""){
//            return studentMapper.selectByExample(null);
//        }
//        if(classid==0){
//            criteria.andNameLike("%"+name+"%");
//        }else {
//            criteria.andClassidEqualTo(classid);
//            criteria.andNameLike("%"+name+"%");
//        }
//
//        return studentMapper.selectByExample(example);
//    }
}
