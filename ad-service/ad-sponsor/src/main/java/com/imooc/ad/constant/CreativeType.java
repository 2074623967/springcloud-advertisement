package com.imooc.ad.constant;

/**
 * @author tangcj
 * @date 2023/05/06 11:37
 **/
public enum CreativeType {

    IMAGE(1, "图片"),
    VIDEO(2, "视频"),
    TEXT(3, "文本");

    private int type;
    private String desc;

    CreativeType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}