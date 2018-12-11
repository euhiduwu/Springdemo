package com.example.demo.service;

import com.example.demo.entity.SysUser;
import com.example.demo.entity.SysUserExample;
import com.example.demo.mapper.SysUserMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class SysUserService {
    private final SysUserMapper sysUserMapper;

    public SysUserService(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }

    public SysUser findByUserName(String name) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria Criteria = sysUserExample.createCriteria();
        Criteria.andUserNameEqualTo(name);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
        if (CollectionUtils.isEmpty(sysUsers)) {
            return null;
        }
        return sysUsers.get(0);
    }
}
