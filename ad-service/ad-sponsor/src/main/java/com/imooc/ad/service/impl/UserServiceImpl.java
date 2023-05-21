package com.imooc.ad.service.impl;

import com.imooc.ad.constant.Constants;
import com.imooc.ad.dao.AdUserRepository;
import com.imooc.ad.entity.AdUser;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.service.IUserService;
import com.imooc.ad.utils.CommonUtils;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreateUserResponse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tangcj
 * @date 2023/05/06 14:01
 **/
@Slf4j
@Service
public class UserServiceImpl implements IUserService {
    private final AdUserRepository userRepository;
    @Autowired
    public UserServiceImpl(AdUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * @param request
     * @return CreateUserResponse
     * 创建用户
     **/
    @Transactional
    @Override
    public CreateUserResponse createUser(CreateUserRequest request) throws AdException {
        //校验参数
        if (!request.validate()) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        //判断是否有同名用户存在
        AdUser oldUser = userRepository.findByUsername(request.getUsername());
        if (oldUser != null) {
            throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }
        //开始创建用户
        AdUser newUser = userRepository.save(new AdUser(request.getUsername(), CommonUtils.md5(request.getUsername())));
        return new CreateUserResponse(newUser.getId(), newUser.getUsername(), newUser.getToken(), newUser.getCreateTime(), newUser.getUpdateTime());
    }
}
