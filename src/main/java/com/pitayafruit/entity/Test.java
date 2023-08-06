package com.pitayafruit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 测试实体
 */
@Data
@TableName("test")
public class Test {

    // 主键
    @TableId(type = IdType.AUTO)
    private Integer id;

    // 姓名
    private String name;

}
