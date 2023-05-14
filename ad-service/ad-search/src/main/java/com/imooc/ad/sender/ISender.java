package com.imooc.ad.sender;

import com.imooc.ad.mysql.dto.MySqlRowData;

/**
 * @author tangcj
 * @date 2023/05/14 14:34
 **/
public interface ISender {

    /**
     * 发送消息到MQ
     *
     * @param rowData
     * @return void
     **/
    void sender(MySqlRowData rowData);
}
