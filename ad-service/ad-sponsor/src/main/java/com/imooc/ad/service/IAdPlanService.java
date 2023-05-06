package com.imooc.ad.service;

import com.imooc.ad.entity.AdPlan;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.AdPlanGetRequest;
import com.imooc.ad.vo.AdPlanRequest;
import com.imooc.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * @author tangcj
 * @date 2023/05/06 14:12
 **/
public interface IAdPlanService {

    /**
     * @param request
     * @return AdPlanResponse
     * 创建推广计划
     **/
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * @param request
     * @return java.util.List<com.imooc.ad.entity.AdPlan>
     * 查询推广计划
     **/
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * @param request
     * @return AdPlanResponse
     * 更新推广计划
     **/
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * @param request
     * @return void
     * 删除推广计划
     **/
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
