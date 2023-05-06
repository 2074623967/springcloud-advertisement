package com.imooc.ad.service;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.*;

/**
 * @author tangcj
 * @date 2023/05/06 14:39
 **/
public interface IAdUnitService {

    /**
     * @param request
     * @return com.imooc.ad.vo.AdUnitResponse
     * 创建推广单元
     **/
    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    /**
     * @param request
     * @return com.imooc.ad.vo.AdUnitKeywordResponse
     * 创建关键词限制
     **/
    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request) throws AdException;

    /**
     * @param request
     * @return com.imooc.ad.vo.AdUnitItResponse
     * 创建兴趣限制
     **/
    AdUnitItResponse createUnitIt(AdUnitItRequest request) throws AdException;

    /**
     * @param request
     * @return com.imooc.ad.vo.AdUnitDistrictResponse
     * 创建地域限制
     **/
    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request) throws AdException;

    /**
     * @param request
     * @return com.imooc.ad.vo.CreativeUnitResponse
     * 创建创意与推广单元关联
     **/
    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request) throws AdException;
}
