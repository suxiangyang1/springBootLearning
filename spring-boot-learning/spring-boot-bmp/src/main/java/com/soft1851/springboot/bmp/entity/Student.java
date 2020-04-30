package com.soft1851.springboot.bmp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author ysx
 */
@TableName("t_student")
@Data
public class Student {

    @TableId(value = "student_id",type = IdType.INPUT)
    private Integer studentId;
    private Integer clazzId;
    private String studentName;
    private String hometown;
    private Timestamp birthday;
}
