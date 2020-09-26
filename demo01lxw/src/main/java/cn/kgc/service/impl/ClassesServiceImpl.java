package cn.kgc.service.impl;

import cn.kgc.mapper.ClassesMapper;
import cn.kgc.pojo.Classes;
import cn.kgc.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 15:16
 */
@Service("classService")
public class ClassesServiceImpl implements ClassesService {
    @Resource
    ClassesMapper classesMapper;

    @Override
    public List<Classes> selectAll() {
        List<Classes> classes = classesMapper.selectByExample(null);
        return classes;
    }
}
