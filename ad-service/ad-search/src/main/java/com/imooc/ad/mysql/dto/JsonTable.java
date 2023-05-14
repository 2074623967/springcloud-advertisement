package com.imooc.ad.mysql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author tangcj
 * @date 2023/05/14 11:24
 * 表达模板文件中的表
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonTable {

    private String tableName;

    private Integer level;

    private List<Column> insert;

    private List<Column> update;

    private List<Column> delete;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Column {
        private String column;
    }
}
