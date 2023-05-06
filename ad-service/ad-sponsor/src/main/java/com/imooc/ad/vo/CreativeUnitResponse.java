package com.imooc.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author tangcj
 * @date 2023/05/06 14:45
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeUnitResponse {
    private List<Long> ids;
}
