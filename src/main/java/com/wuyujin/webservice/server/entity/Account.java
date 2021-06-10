package com.wuyujin.webservice.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Description TODO
 *
 * @ClassName com.wuyujin.webservice.server.entity.Account
 * @Version 1.0
 * @Date: 2021/6/10 9:08 下午
 * @User leung
 * @Author yujin.wu@outlook.com
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account extends BaseEntity {
    private String accountId;
    private Integer age;
    private Boolean married;
    private List<String> hobbies;
    private Contact contact;
}
