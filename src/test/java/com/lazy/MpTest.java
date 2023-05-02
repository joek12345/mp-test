package com.lazy;

import com.lazy.mapper.EmpMapper;
import com.lazy.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Joe_Lazy
 * Date: 2023/4/28 16:28:51
 */
@SpringBootTest
public class MpTest {
    @Autowired
    private EmpMapper empMapper;

    @Test
    void selectTest(){
        List<Emp> list = empMapper.selectList(null);
        list.forEach(System.out::println);
    }


}
