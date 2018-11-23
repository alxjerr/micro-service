package com.microservice.cloud.edu.mapper;

import com.microservice.cloud.edu.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {

}
