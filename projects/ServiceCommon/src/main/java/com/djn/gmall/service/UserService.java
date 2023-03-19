package com.djn.gmall.service;

import com.djn.gmall.bean.UserAddress;

import java.util.List;

public interface UserService {

    /**
     * 按照用户id返回所有的收货地址
     * @param userId 用户id
     * @return 收货地址集合
     */
    public List<UserAddress> getUserAddressList(String userId);
}
