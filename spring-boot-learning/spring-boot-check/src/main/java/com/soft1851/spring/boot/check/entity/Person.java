package com.soft1851.spring.boot.check.entity;

import com.soft1851.spring.boot.check.annotation.PhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author ysx
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @NotNull(message = "Id 不能为空")
    private String id;

//    @Size(max = 30)
    @NotNull(message = "name 不能为空")
    private String name;

    @Min(18)
    private Integer age;

    /**
     * 第1位数字为1，第二位为[3,4,5,7,8]中的一个，其余0~9随意
     */
//    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误")
    @NotNull(message = "手机号码不能为空")
    @PhoneNumber(message = "手机号码格式错误")
    private String phone;

    @Email(message = "邮箱格式错误")
    @NotNull(message = "email 不能为空")
    private String email;

    @Pattern(regexp = "((^Man$|^Woman$|^UGM$))",message = "sex 不在可选范围")
    @NotNull(message = "sex 不能为空")
    private String sex;
}
