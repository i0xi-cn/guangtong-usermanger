package cn.i0xi.guangtong.controller;

import cn.i0xi.guangtong.domain.Users;
import cn.i0xi.guangtong.service.UsersService;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloController {


    @Resource
    UsersService usersService;
    @RequestMapping("/hello")
    public List<Users> hello() {
        return usersService.list();
    }
}
