package com.soft1851.springboot.jwt.service;

import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author ysx
 * 模拟Admin服务
 */
@Service
public class AdminService {

    /**
     * 根据role获得权限
     */
    public List<String> getPermissionByRole(String role) {
        Map<String,List<String>> map = new TreeMap<>();
        String[] admins = {"专辑管理","歌曲管理"};
        String[] superAdmins = {"权限管理","系统设置"};
        map.put("admin", Arrays.asList(admins));
        map.put("superAdmin",Arrays.asList(superAdmins));
        return map.get(role);
    }

    public boolean checkRole(String role) {
        if ("admin".equals(role) || ("superAdmin".equals(role))) {
            return true;
        } else {
            return false;
        }
    }
}
