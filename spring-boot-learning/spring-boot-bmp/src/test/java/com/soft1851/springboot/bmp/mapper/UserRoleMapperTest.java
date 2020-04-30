package com.soft1851.springboot.bmp.mapper;

import com.soft1851.springboot.bmp.model.UserRole;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class UserRoleMapperTest {
    @Resource
    private UserRoleMapper userRoleMapper;

    @Test
    void testSelectAll(){
        List<UserRole> students = userRoleMapper.selectList(null);
        students.forEach(System.out::println);
    }
}