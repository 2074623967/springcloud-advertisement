package com.imooc.ad.index.creative;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tangcj
 * @date 2023/05/13 17:18
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeObject {

    private Long adId;

    private String name;

    private Integer type;

    private Integer materialType;

    private Integer height;

    private Integer width;

    private Integer auditStatus;

    private String adUrl;

    public void update(CreativeObject creativeObject) {

        if (creativeObject.getAdId() != null) {
            this.adId = creativeObject.getAdId();
        }
        if (creativeObject.getName() != null) {
            this.name = creativeObject.getName();
        }

        if (creativeObject.getType() != null) {
            this.type = creativeObject.getType();
        }

        if (creativeObject.getMaterialType() != null) {
            this.materialType = creativeObject.getMaterialType();
        }

        if (creativeObject.getHeight() != null) {
            this.height = creativeObject.getHeight();
        }

        if (creativeObject.getWidth() != null) {
            this.width = creativeObject.getWidth();
        }

        if (creativeObject.getAuditStatus() != null) {
            this.auditStatus = creativeObject.getAuditStatus();
        }

        if (creativeObject.getAdUrl() != null) {
            this.adUrl = creativeObject.getAdUrl();
        }

    }
}
