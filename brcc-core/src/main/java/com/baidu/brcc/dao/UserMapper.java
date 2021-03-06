/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.UserExample;

@Mapper
public interface UserMapper extends BaseMapper<User, Long, UserExample> {
}
