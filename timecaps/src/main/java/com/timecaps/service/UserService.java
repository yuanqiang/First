package com.timecaps.service;

import com.timecaps.common.exception.SystemErrorCodeConstant;
import com.timecaps.dao.UserMapper;
import com.timecaps.dao.UserMapperExt;
import com.timecaps.dao.entity.Record;
import com.timecaps.dao.entity.User;
import com.timecaps.helper.ErrorHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuanqiang on 2018/3/5.
 */

@Service
public class UserService {
    private final Logger logger = LoggerFactory.getLogger(RecordService.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserMapperExt userMapperExt;

    /**
     * 登录
     * @param name
     * @param pass
     * @return
     */
    public User login(String name, String pass) {
        User user = userMapperExt.login(name, pass);

        if (user == null) {
            logger.error("账号或密码有误");
            ErrorHandler.throwError(SystemErrorCodeConstant.USER_NO_EXIST);
        }

        return user;
    }


    /**
     * 添加用户
     * @param name
     * @param pass
     * @return
     */
    public int addUser(String name, String pass) {
        User user = userMapperExt.selectByName(name);

        if (user != null) {
            logger.error("该用户已存在");
            ErrorHandler.throwError(SystemErrorCodeConstant.USER_EXIST);
        }

        user = new User();
        user.setName(name);
        user.setPass(pass);

        int result = userMapper.insert(user);

        if(result != 1) {
            logger.error("插入记录失败");
            ErrorHandler.throwError(SystemErrorCodeConstant.INSERT_FAILED);
        }

        return result;
    }

}
