# SpringBoot AOP学习体会

###1.SpringBoot AOP对Web日志的拦截相关操作

###2.MockMvc单元测试

###  3.SpringBoot结合AOP和注解实现权限

- 自定义注解类：@AuthToken:认证鉴权注解

- 三个注解：

```
@Target({ElementType.METHOD,ElementType.TYPE})

@Retention(RetentionPolicy.RUNTIME)

@Documented
```





- 方法：访问接口所需要的身份，默认为空，即登录即可访问，可以定义多个，返回的是一个String类型的数组；

- controller层：共有三种形式的认证和鉴权

- 无需任何校验，无需加注解（自定义的注解类）

- 需要认证，此时该方法需要加注解，但是不需要传角色，任何角色都可以登录访问；

- 需要鉴权，并且需要加注解，同时必须传角色，有访问权限：这个role_name是一个数组，可以定义多个值进行模拟登录；

@AuthToken(role_name = {"admin","Admin"})

- 切面逻辑：AuthTokenAspect

- 定义切点，这里并不是横切controller下的所有方法，而是加了@authToken注解的，才进行横切；

```
@Pointcut("@annotation(authToken)")

**public** **void** **doAuthToken**(AuthToken authToken) {

}
```



- 通过最强的环绕增强进行模拟登录的整个过程：

```
@**Around**(**value** = "doAuthToken(authToken)", argNames = "pjp,authToken")
public Object doAround(ProceedingJoinPoint pjp, AuthToken authToken) throws Throwable {
    //Object与controller中返回值得类型有关
}    
```





