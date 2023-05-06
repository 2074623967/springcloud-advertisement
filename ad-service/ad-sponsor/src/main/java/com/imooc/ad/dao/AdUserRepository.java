package com.imooc.ad.dao;

import com.imooc.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tangcj
 * @date 2023/05/06 11:42
 **/
public interface AdUserRepository extends JpaRepository<AdUser,Long> {

    /**
     * @param username
     * @return com.imooc.ad.entity.AdUser
     * 根据用户名查询用户信息
     **/
    AdUser findByUsername(String username);

}
