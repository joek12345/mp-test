package com.lazy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lazy.mapper.EmpMapper;
import com.lazy.pojo.Emp;
import com.lazy.service.EmpService;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: Joe_Lazy
 * Date: 2023/4/28 16:36:18
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {
}
