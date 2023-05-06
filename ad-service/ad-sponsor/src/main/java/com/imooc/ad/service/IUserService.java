package com.imooc.ad.service;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreateUserResponse;

/**
 * @author tangcj
 * @date 2023/05/06 13:57
 **/
public interface IUserService {

    /**
     * @param request
     * @return CreateUserResponse
     * 创建用户
     **/
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}