package com.imooc.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * @author tangcj
 * @date 2023/05/06 14:41
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitRequest {
    private Long planId;
    private String unitName;
    private Integer positionType;
    private Long budget;
    public boolean createValidate() {
        return null != planId && !StringUtils.isEmpty(unitName) && positionType != null && budget != null;
    }
}