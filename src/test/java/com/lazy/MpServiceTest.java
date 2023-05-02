package com.lazy;

import com.lazy.pojo.Emp;
import com.lazy.service.EmpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Joe_Lazy
 * Date: 2023/4/28 16:37:31
 */
@SpringBootTest
public class MpServiceTest {

    @Autowired
    private EmpService empService;

    @Test
    void selectTest(){
        List<Emp> list = empService.list();
        list.forEach(System.out::println);
    }

    @Test
    void getCountTest(){
        int count = empService.count();
        System.out.println("count:"+count);
    }

}
