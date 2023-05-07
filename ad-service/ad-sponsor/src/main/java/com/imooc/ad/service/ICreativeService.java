package com.imooc.ad.service;

import com.imooc.ad.vo.CreativeRequest;
import com.imooc.ad.vo.CreativeResponse;

/**
 * @author tangcj
 * @date 2023/05/07 11:24
 **/
public interface ICreativeService {

    /**
     * @param request
     * @return CreativeResponse
     * 创建创意
     **/
    CreativeResponse createCreative(CreativeRequest request);
}
