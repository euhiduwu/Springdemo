package com.example.demo.service;

import com.example.demo.entity.UserInfo;
import com.example.demo.entity.UserInfoExample;
import com.example.demo.mapper.UserInfoMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {
    private final UserInfoMapper userInfoMapper;

    public UserInfoService(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

//    @Cacheable(cacheNames = "userInfo",key = "#page")
//    缓存 name
    public PageInfo<UserInfo> getUserInfo(Integer page, Integer number) {
        System.out.printf("没有缓存，开始访问数据库...");
        if (page != null && number != null) {
            PageHelper.startPage(page, number);
        }
        UserInfoExample userInfoExample = new UserInfoExample();
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        return new PageInfo<>(userInfos);
    }
}
