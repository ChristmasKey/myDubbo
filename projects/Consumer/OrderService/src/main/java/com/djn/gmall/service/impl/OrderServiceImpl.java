package com.djn.gmall.service.impl;

import com.djn.gmall.bean.UserAddress;
import com.djn.gmall.service.OrderService;
import com.djn.gmall.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("orderService1")
public class OrderServiceImpl implements OrderService {

    @Resource
    UserService userService;

    @Override
    public void initOrder(String userId) {
        System.out.println("用户id：" + userId);
        // 1.查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        addressList.forEach(address -> System.out.println(address.getUserAddress()));
    }
}
