package com.imooc.ad.dao;

import com.imooc.ad.entity.AdPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author tangcj
 * @date 2023/05/06 11:44
 **/
public interface AdPlanRepository extends JpaRepository<AdPlan,Long> {

    /**
     * @param id
     * @param userId
     * @return com.imooc.ad.entity.AdPlan
     * 根据用户ID和推广计划ID查询推广计划
     **/
    AdPlan findByIdAndUserId(Long id, Long userId);

    /**
     * @param ids
     * @param userId
     * @return com.imooc.ad.entity.AdPlan
     * 根据用户ID和推广计划IDS查询推广计划
     **/
    List<AdPlan> findAllByIdInAnAndUserId(List<Long> ids, Long userId);

    /**
     * @param userId
     * @param planName
     * @return com.imooc.ad.entity.AdPlan
     * 根据用户ID和推广计划名称查询推广计划
     **/
    AdPlan findByUserIdaAndPlanName(Long userId, String planName);

    /**
     * @param status
     * @return java.util.List<com.imooc.ad.entity.AdPlan>
     * 根据状态查询推广计划表
     **/
    List<AdPlan> findAllByPlanStatus(Integer status);
}
