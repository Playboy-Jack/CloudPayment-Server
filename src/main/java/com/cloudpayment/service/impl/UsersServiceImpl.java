package com.cloudpayment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudpayment.domain.Users;
import com.cloudpayment.service.UsersService;
import com.cloudpayment.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author Jack
* @description 针对表【users(用户表)】的数据库操作Service实现
* @createDate 2023-12-15 14:35:19
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




