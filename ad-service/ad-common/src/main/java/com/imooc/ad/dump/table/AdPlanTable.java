package com.imooc.ad.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author tangcj
 * @date 2023/05/13 17:47
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanTable {

    private Long id;

    private Long userId;

    private Integer planStatus;

    private Date startDate;

    private Date endDate;
}
