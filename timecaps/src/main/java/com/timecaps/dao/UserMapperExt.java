package com.timecaps.dao;

import com.timecaps.dao.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yuanqiang on 2018/3/5.
 */
public interface UserMapperExt {

    public User login(@Param("name") String name, @Param("pass") String pass);

    public User selectByName(@Param("name") String name);

}
