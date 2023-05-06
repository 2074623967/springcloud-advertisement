package com.imooc.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * @author tangcj
 * @date 2023/05/06 13:58
 * 创建用户vo类
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
    private String username;
    public boolean validate() {
        return StringUtils.isEmpty(username);
    }

}