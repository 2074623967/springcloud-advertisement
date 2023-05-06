package com.imooc.ad.dao;

import com.imooc.ad.entity.unitcondition.AdUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author tangcj
 * @date 2023/05/06 11:53
 **/
public interface AdUnitRepository extends JpaRepository<AdUnit,Long> {

    /**
     * @param planId
     * @param unitName
     * @return com.imooc.ad.entity.unitcondition.AdUnit
     * 根据推广单元计划ID和推广单元名称查询推广单元
     **/
    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);

    /**
     * @param unitStatus
     * @return java.util.List<com.imooc.ad.entity.unitcondition.AdUnit>
     * 根据推广单元状态查询推广单元
     **/
    List<AdUnit> findAllByUnitStatus(Integer unitStatus);
}
