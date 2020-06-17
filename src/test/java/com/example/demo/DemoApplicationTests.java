package com.example.demo;

import com.example.demo.bean.UserInfo;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
       UserInfo userBean = userService.loginIn("1","1");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());

    }

}
