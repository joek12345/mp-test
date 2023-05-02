package com.lazy;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lazy.mapper.EmpMapper;
import com.lazy.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Joe_Lazy
 * Date: 2023/4/28 23:06:26
 */
@SpringBootTest
public class MpPluginsTest {

    @Autowired
    private EmpMapper empMapper;

    @Test
    void pageTest(){
        Page<Emp> page = new Page<>(2,5);
        empMapper.selectPage(page,null);
        System.out.println(page.getRecords());
        System.out.println("总页数："+page.getPages());
        System.out.println("总记录数："+page.getTotal());
        System.out.println("是否有上一页："+page.hasPrevious());
        System.out.println("是否有下一页："+page.hasNext());
    }

    @Test
    void testPageByDeptId() {
        Page<Emp> page = new Page<>(1,2);
        empMapper.selectByDeptId(page, (short)1);
        List<Emp> records = page.getRecords();
        records.forEach(System.out::println);
        System.out.println("总页数："+page.getPages());
        System.out.println("总记录数："+page.getTotal());
        System.out.println("是否有上一页："+page.hasPrevious());
        System.out.println("是否有下一页："+page.hasNext());
    }

}
