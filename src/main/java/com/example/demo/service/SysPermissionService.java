package com.example.demo.service;

import com.example.demo.mapper.SysPermissionMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysPermissionService {
    private final SysPermissionMapper sysPermissionMapper;

    public SysPermissionService(SysPermissionMapper sysPermissionMapper) {
        this.sysPermissionMapper = sysPermissionMapper;
    }

    /*
    * 不清楚该返回什么
    * */
    public List<String> selectPermissionByUserId(Long userId) {
        return new ArrayList<>();
    }
}
