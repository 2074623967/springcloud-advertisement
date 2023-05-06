package com.imooc.ad.dao;

import com.imooc.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tangcj
 * @date 2023/05/06 11:56
 **/
public interface CreativeRepository extends JpaRepository<Creative,Long> {
}
