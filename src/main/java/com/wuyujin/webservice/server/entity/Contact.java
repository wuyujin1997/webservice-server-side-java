package com.wuyujin.webservice.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Description TODO
 *
 * @ClassName com.wuyujin.webservice.server.entity.Contact
 * @Version 1.0
 * @Date: 2021/6/10 9:11 下午
 * @User leung
 * @Author yujin.wu@outlook.com
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact extends BaseEntity {
    private Integer qq;
    private String wechat;
    private List<String> telList;
}
