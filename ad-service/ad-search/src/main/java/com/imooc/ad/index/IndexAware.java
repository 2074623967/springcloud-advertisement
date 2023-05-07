package com.imooc.ad.index;

/**
 * @author tangcj
 * @date 2023/05/07 19:59
 **/
public interface IndexAware<K,V> {

    V get(K key);

    void add(K key,V value);

    void update(K key,V value);

    void delete(K key,V value);
}
