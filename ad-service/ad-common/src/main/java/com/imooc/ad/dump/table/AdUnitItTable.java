package com.imooc.ad.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tangcj
 * @date 2023/05/13 17:52
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitItTable {

    private Long unitId;

    private String itTag;
}
