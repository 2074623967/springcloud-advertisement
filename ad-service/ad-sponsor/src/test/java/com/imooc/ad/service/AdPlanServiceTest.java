package com.imooc.ad.service;

import com.alibaba.fastjson.JSON;
import com.imooc.ad.SponsorApplicationTest;
import com.imooc.ad.entity.AdPlan;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.AdPlanGetRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;

/**
 * @author tangcj
 * @date 2023/05/21 10:17
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SponsorApplicationTest.class}, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class AdPlanServiceTest {

    @Autowired
    private IAdPlanService planService;

    @Test
    public void getAdPlanByIdsTest() throws AdException {
        AdPlanGetRequest request = new AdPlanGetRequest();
        request.setIds(Collections.singletonList(10L));
        request.setUserId(15L);
        List<AdPlan> adPlanList = planService.getAdPlanByIds(request);
        log.info(JSON.toJSONString(adPlanList));
    }
}
