package com.imooc.ad.mysql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author tangcj
 * @date 2023/05/14 11:27
 * 表达整个模板文件
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Template {

    private String database;

    private List<JsonTable> tableList;
}
