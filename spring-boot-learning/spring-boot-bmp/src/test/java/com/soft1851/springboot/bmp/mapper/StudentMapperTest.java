package com.soft1851.springboot.bmp.mapper;

import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;


//    /**
//     * 测试所有
//     */
//    @Test
//    void tesTSelectAll(){
//        List<Student> students = studentMapper.selectList(null);
//        students.forEach(System.out::println);
//    }
//
//    /**
//     * 更具id删除
//     */
//    @Test
//    void testDelete(){
//        System.out.println(studentMapper.deleteById(2011));
//    }
//
//    /**
//     * 查询总数
//     */
//    @Test
//    void queryCount(){
//        int n = studentMapper.selectCount(null);
//        System.out.println(n);
//    }
}