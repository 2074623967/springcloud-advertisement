package com.imooc.ad.mysql.listener;

import com.imooc.ad.mysql.dto.BinlogRowData;

/**
 * @author tangcj
 * @date 2023/05/14 12:58
 * 监听器
 **/
public interface Ilistener {

    /**
     * 对应不同表定义不同的数据更新方法,即注册不同的监听器.
     **/
    void register();

    /**
     * 事件监听
     * @param eventData
     * @return void
     **/
    void onEvent(BinlogRowData eventData);
}
