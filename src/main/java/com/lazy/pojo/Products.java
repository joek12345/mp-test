package com.lazy.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.lazy.enums.StatusEnum;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by IntelliJ IDEA.
 * User: Joe_Lazy
 * Date: 2023/4/28 23:41:34
 */
@Data
@TableName(value = "goods")
public class Products {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer goodsId;
    @TableField(value = "name")
    private String goodName;
    private Integer price;
    @Version  // 标识乐观锁版本号字段
    private Integer version;
    private StatusEnum status;
}
