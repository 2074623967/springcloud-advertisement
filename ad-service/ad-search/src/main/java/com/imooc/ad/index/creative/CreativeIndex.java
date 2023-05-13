package com.imooc.ad.index.creative;

import com.imooc.ad.index.IndexAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author tangcj
 * @date 2023/05/13 17:23
 **/
@Slf4j
@Component
public class CreativeIndex implements IndexAware<Long, CreativeObject> {

    private static Map<Long, CreativeObject> objectMap;

    static {
        objectMap = new ConcurrentHashMap<>();
    }

    @Override
    public CreativeObject get(Long key) {
        return objectMap.get(key);
    }

    @Override
    public void add(Long key, CreativeObject value) {
        log.info("before add: {}", objectMap);
        objectMap.put(key, value);
        log.info("before after: {}", objectMap);
    }

    @Override
    public void update(Long key, CreativeObject value) {
        log.info("update add: {}", objectMap);
        CreativeObject creativeObject = objectMap.get(key);
        if (null == creativeObject) {
            objectMap.put(key, value);
        } else {
            creativeObject.update(value);
        }
        log.info("update after: {}", objectMap);
    }

    @Override
    public void delete(Long key, CreativeObject value) {
        log.info("before delete: {}", objectMap);
        objectMap.remove(key);
        log.info("after delete: {}", objectMap);
    }
}
