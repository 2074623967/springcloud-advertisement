package com.imooc.ad.search.vo.media;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tangcj
 * @date 2023/05/14 21:17
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Geo {

    private Float latitude;

    private Float longitude;

    private String city;

    private String province;
}
