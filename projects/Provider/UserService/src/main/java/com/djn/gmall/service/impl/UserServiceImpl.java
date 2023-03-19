package com.djn.gmall.service.impl;

import com.djn.gmall.bean.UserAddress;
import com.djn.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress();
        address1.setId(1);
        address1.setUserAddress("地址一");
        address1.setUserId("1");
        address1.setConsignee("李老师");
        address1.setPhoneNum("123456789");
        address1.setIsDefault("YES");
        UserAddress address2 = new UserAddress();
        address1.setId(2);
        address2.setUserAddress("地址二");
        address2.setUserId("1");
        address2.setConsignee("王老师");
        address2.setPhoneNum("123456780");
        address2.setIsDefault("NO");

        return Arrays.asList(address1, address2);
    }
}
