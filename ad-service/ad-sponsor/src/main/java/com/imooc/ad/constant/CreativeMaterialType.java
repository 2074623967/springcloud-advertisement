package com.imooc.ad.constant;

/**
 * @author tangcj
 * @date 2023/05/06 11:39
 **/
public enum CreativeMaterialType {

    JPG(1, "jpg"),
    BMP(2, "bmp"),

    MP4(3, "mp4"),
    AVI(4, "avi"),

    TXY(5, "txt");


    private int type;
    private String desc;

    CreativeMaterialType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}