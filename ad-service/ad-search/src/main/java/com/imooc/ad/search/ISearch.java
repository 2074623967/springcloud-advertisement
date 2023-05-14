package com.imooc.ad.search;

import com.imooc.ad.search.vo.SearchRequest;
import com.imooc.ad.search.vo.SearchResponse;

/**
 * @author tangcj
 * @date 2023/05/14 21:05
 **/
public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);
}
