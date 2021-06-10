package com.wuyujin.webservice.server;

import com.wuyujin.webservice.server.webservice.AccountWebService;

import javax.xml.ws.Endpoint;

/**
 * Description TODO
 *
 * @ClassName com.wuyujin.webservice.server.WebServiceApplication
 * @Version 1.0
 * @Date: 2021/6/10 9:00 下午
 * @User leung
 * @Author yujin.wu@outlook.com
 */
public class WebServiceApplication {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:5000/ws-server-java/Account", new AccountWebService());
    }
}
