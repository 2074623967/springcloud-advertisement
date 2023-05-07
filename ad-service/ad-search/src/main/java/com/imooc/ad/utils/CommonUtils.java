package com.imooc.ad.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

/**
 * @author tangcj
 * @date 2023/05/07 20:43
 **/
@Slf4j
public class CommonUtils {

    public static <K, V> V getorCreate(K key, Map<K, V> map, Supplier<V> factory) {
        return map.computeIfAbsent(key, k -> factory.get());
    }


}
