package com.lazy.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * Created by IntelliJ IDEA.
 * User: Joe_Lazy
 * Date: 2023/4/29 0:11:21
 */
@Getter
public enum StatusEnum {
    EXIST(1,"在销"),
    NO_EXIST(0,"停销");

    @EnumValue // 将注解所标识的属性的只存储到数据库中
    private Integer status;
    private String describe;

    StatusEnum(Integer status, String describe) {
        this.status = status;
        this.describe = describe;
    }
    StatusEnum(){}
}
