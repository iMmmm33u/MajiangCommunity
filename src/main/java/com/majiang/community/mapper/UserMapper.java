package com.majiang.community.mapper;

import com.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("insert into users (NAME, ACCOUNT_ID, TOKEN, GMT_CREATE, GMT_MODIFIED) values (#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified})")
    void insert(User user);
}
