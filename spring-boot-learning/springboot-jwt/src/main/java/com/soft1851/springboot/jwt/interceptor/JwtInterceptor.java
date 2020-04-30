package com.soft1851.springboot.jwt.interceptor;

import com.auth0.jwt.exceptions.InvalidClaimException;
import com.soft1851.springboot.jwt.common.ResultCode;
import com.soft1851.springboot.jwt.exception.JwtException;
import com.soft1851.springboot.jwt.service.AdminService;
import com.soft1851.springboot.jwt.util.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ysx
 * JWT拦截器
 */
@Slf4j
@Component
public class JwtInterceptor implements HandlerInterceptor {
    @Resource
    private AdminService adminService;


    /**
     * 前置处理，拦截请求
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("Authorization");
        if (token == null) {
            log.info("### 用户未登录，请先登录 ###");
            throw new JwtException("用户未登录，请先登录", ResultCode.USER_NOT_SIGN_IN);
        } else {
            log.info("## token={}",token);
            //鉴权
            if (!adminService.checkRole(JwtTokenUtil.getUserRole(token))) {
                log.info("### 用户权限不足 ###");
                //通过自定义异常处理抛出权限不足的信息
                throw new JwtException("用户权限不足", ResultCode.PERMISSION_NO_ACCESS);
            }else {
                if (JwtTokenUtil.isExpiration(token)) {
                    log.info("### token已经失效 ###");
                    //同公共自定义异常处理抛出token失效的信息，有全局统一处理
                    throw new InvalidClaimException("token失效");
                }else {
                    //通过拦截，进入到控制台
                    return true;
                }
            }
        }
    }
}
