package com.djn.gmall.service;

import com.djn.gmall.bean.UserAddress;

import java.util.List;

public interface OrderService {

    /**
     * 初始化订单
     * @param userId 用户id
     */
    public List<UserAddress> initOrder(String userId);
}
