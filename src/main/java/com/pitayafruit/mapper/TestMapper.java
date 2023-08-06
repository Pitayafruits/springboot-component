package com.pitayafruit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pitayafruit.entity.Test;
import org.apache.ibatis.annotations.Mapper;

/**
 * 测试mapper接口
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {
}
