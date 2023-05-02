package com.lazy.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * User: Joe_Lazy
 * Date: 2023/4/28 16:24:06
 */

@Data
//@TableName("emp")  // 当实体类名与数据表名不一致时  使用此注解指定表名
public class Emp {
    //@TableId  // mp 默认将 id 作为主键，如果用其他属性名  将属性对应的字段作为主键
    @TableId(type = IdType.AUTO)  // type 指定主键生成策略  默认是雪花算法  IdType.AUTO 数据库自增
    private Long id;
    //@TableField("username")  // 解决字段名与属性名不一致  指定属性名对应的字段名
    private String username;
    private String password;
    private String name;
    private Short gender;
    private String image;
    private Short job;
    private LocalDate entrydate;
    private Short deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    //@TableLogic  // 逻辑删除  用状态位表示删除状态
    //private int status;
}
