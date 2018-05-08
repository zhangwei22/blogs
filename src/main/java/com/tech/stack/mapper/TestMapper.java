package com.tech.stack.mapper;

import com.tech.stack.model.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by zhangwei on 2018/5/8.
 */
@Mapper
public interface TestMapper {
    @Select("SELECT * FROM TEST")
    Test findAll();
}
