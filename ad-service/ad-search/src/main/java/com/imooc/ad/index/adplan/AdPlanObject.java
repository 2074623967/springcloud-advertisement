package com.imooc.ad.index.adplan;

import com.imooc.ad.index.IndexAware;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.print.PrinterIOException;
import java.util.Date;

/**
 * @author tangcj
 * @date 2023/05/07 20:03
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanObject {

    private Long planId;

    private Long userId;

    private Integer planStatus;

    private Date startDate;

    private Date endDate;

    public void update(AdPlanObject newPlanObject) {
        if (null != newPlanObject.getPlanId()) {
            this.planId = newPlanObject.getPlanId();
        }
        if (null != newPlanObject.getUserId()) {
            this.userId = newPlanObject.getUserId();
        }
        if (null != newPlanObject.getPlanStatus()) {
            this.planStatus = newPlanObject.getPlanStatus();
        }
        if (null != newPlanObject.getStartDate()) {
            this.startDate = newPlanObject.getStartDate();
        }
        if (null != newPlanObject.getEndDate()) {
            this.endDate = newPlanObject.getEndDate();
        }
    }
}
