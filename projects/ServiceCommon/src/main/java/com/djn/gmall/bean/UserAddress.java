package com.djn.gmall.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Name: UserAddress
 * Description: 用户地址
 * Copyright: Copyright (c) 2023 MVWCHINA All rights Reserved
 * Company: 江苏医视教育科技发展有限公司
 *
 * @author 丁佳男
 * @version 1.0
 * @since 2023/3/19 22:29
 */
@Data
@NoArgsConstructor
public class UserAddress implements Serializable {

    private Integer id;
    //用户地址
    private String userAddress;
    //用户id
    private String userId;
    //收货人
    private String consignee;
    //电话号码
    private String phoneNum;
    //是否为默认地址
    private String isDefault;
}
