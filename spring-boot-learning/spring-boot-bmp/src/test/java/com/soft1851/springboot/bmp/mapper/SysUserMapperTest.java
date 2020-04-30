package com.soft1851.springboot.bmp.mapper;

import com.soft1851.springboot.bmp.model.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SysUserMapperTest {
    @Resource
    private SysUserMapper sysUserMapper;


    @Test
    void testSelectAll(){
        List<SysUser> students = sysUserMapper.selectList(null);
        students.forEach(System.out::println);
    }

    @Test
    void selectByUserId() {
        List<SysUser> sysUsers = sysUserMapper.selectByUserId("2");
        sysUsers.forEach(System.out::println);
    }
}