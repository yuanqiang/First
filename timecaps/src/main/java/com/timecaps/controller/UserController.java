package com.timecaps.controller;

import com.timecaps.common.core.HttpResult;
import com.timecaps.controller.base.AbstractController;
import com.timecaps.dao.entity.Record;
import com.timecaps.dao.entity.User;
import com.timecaps.request.AddRecordRequest;
import com.timecaps.service.RecordService;
import com.timecaps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yuanqiang on 2018/3/5.
 */

@RestController
@RequestMapping("/")
public class UserController extends AbstractController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param name
     * @param pass
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public HttpResult<User> listRecords(@RequestParam String name, @RequestParam String pass){
        return HttpResult.successWithData(userService.login(name, pass));
    }

    /**
     * 注册
     * @param name
     * @param pass
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public HttpResult addRecord(@RequestParam String name, @RequestParam String pass) {
        userService.addUser(name, pass);
        return HttpResult.successWithData(null);
    }

}
