package com.imooc.ad.index.district;

import com.imooc.ad.index.IndexAware;
import com.imooc.ad.search.vo.feature.DistrictFeature;
import com.imooc.ad.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

/**
 * @author tangcj
 * @date 2023/05/13 17:09
 **/
@Slf4j
@Component
public class UnitDistrictIndex implements IndexAware<String, Set<Long>> {

    /**
     * 反向索引
     **/
    private static Map<String, Set<Long>> districtUnitMap;

    /**
     * 正向索引
     **/
    private static Map<Long, Set<String>> unitDistrictMap;

    static {
        districtUnitMap = new ConcurrentHashMap<>();
        unitDistrictMap = new ConcurrentHashMap<>();
    }

    @Override
    public Set<Long> get(String key) {
        return districtUnitMap.get(key);
    }

    @Override
    public void add(String key, Set<Long> value) {
        log.info("UnitDistrictIndex, before add: {}", unitDistrictMap);
        Set<Long> unitIdSet = CommonUtils.getorCreate(key, districtUnitMap, ConcurrentSkipListSet::new);
        unitIdSet.addAll(value);
        for (Long unitId : value) {
            Set<String> keywordSet = CommonUtils.getorCreate(unitId, unitDistrictMap, ConcurrentSkipListSet::new);
            keywordSet.add(key);
        }
        log.info("UnitDistrictIndex, after add: {}", unitDistrictMap);
    }

    @Override
    public void update(String key, Set<Long> value) {
        log.error("it index can not support update");
    }

    @Override
    public void delete(String key, Set<Long> value) {
        log.info("UnitDistrictIndex, before delete: {}", unitDistrictMap);
        Set<Long> unitIdSet = CommonUtils.getorCreate(key, districtUnitMap, ConcurrentSkipListSet::new);
        unitIdSet.removeAll(value);
        for (Long unitId : value) {
            Set<String> keywordSet = CommonUtils.getorCreate(unitId, unitDistrictMap, ConcurrentSkipListSet::new);
            keywordSet.remove(key);
        }
        log.info("UnitDistrictIndex, after delete: {}", unitDistrictMap);
    }

    public boolean match(Long adUnitId, List<DistrictFeature.ProvinceAndCity> districts) {

        if (unitDistrictMap.containsKey(adUnitId) &&
                CollectionUtils.isNotEmpty(unitDistrictMap.get(adUnitId))) {

            Set<String> unitDistricts = unitDistrictMap.get(adUnitId);

            List<String> targetDistricts = districts.stream()
                    .map(
                            d -> CommonUtils.stringConcat(
                                    d.getProvince(), d.getCity()
                            )
                    ).collect(Collectors.toList());

            return CollectionUtils.isSubCollection(targetDistricts, unitDistricts);
        }

        return false;
    }
}
