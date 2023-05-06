package com.imooc.ad.constant;

import lombok.Getter;

/**
 * @author tangcj
 * @date 2023/05/06 10:54
 **/
@Getter
public enum CommonStatus {

    VALID(1, "有效状态"),
    INVALID(0, "无效状态");

    private Integer status;
    private String desc;

    CommonStatus(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
