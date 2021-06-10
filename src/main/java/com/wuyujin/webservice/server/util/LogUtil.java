package com.wuyujin.webservice.server.util;

import com.alibaba.fastjson.JSON;

import java.time.LocalDateTime;

/**
 * Description 简单的日志记录工具类
 *
 * @ClassName com.wuyujin.webservice.server.util.LogUtil
 * @Version 1.0
 * @Date: 2021/6/10 9:36 下午
 * @User leung
 * @Author yujin.wu@outlook.com
 */
public class LogUtil {

    /**
     * Description 打印入参列表到控制台
     * @date 2021-06-10 21:42:31
     * @user leung
     * @param args
     * @return void
     **/
    public static void log(Object ...args) {
        String info = String.format("[%s] %s", LocalDateTime.now(), JSON.toJSONString(args));
        System.out.println(info);
    }

}
