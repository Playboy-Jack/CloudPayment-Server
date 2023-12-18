package com.cloudpayment.comtroller;


import com.cloudpayment.domain.R;
import com.cloudpayment.domain.Users;
import com.cloudpayment.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UsersService usersService;
    @GetMapping("/user/list")
    public R userList(){
        Map<String,Object> resutMap=new HashMap<>();
        List<Users> userList = usersService.list();
        resutMap.put("userList",userList);
        return R.ok(resutMap);
    }
}
