package com.lazy.mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lazy.pojo.Emp;
import org.apache.ibatis.annotations.Select;

/**
 * Created by IntelliJ IDEA.
 * User: Joe_Lazy
 * Date: 2023/4/28 16:23:52
 */
public interface EmpMapper extends BaseMapper<Emp> {


    /**
     *
     *  通过部门进行查询员工信息 并进行分页
     * @param page  MyBatis-Plus所提供的分页对象  必须位于第一个参数的位置
     * @param deptId
     * @return
     */
    @Select("")
    Page<Emp> selectByDeptId(Page<Emp> page, Short deptId);

    int deleteByIdAndDeptId(@Param("id") Long id, @Param("deptId") Short deptId);

}
