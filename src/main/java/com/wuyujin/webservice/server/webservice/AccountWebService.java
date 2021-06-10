package com.wuyujin.webservice.server.webservice;

import com.wuyujin.webservice.server.entity.Account;
import com.wuyujin.webservice.server.entity.Contact;
import com.wuyujin.webservice.server.util.LogUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.LocalDateTime;
import java.util.Random;

/**
 * Description TODO
 *
 * @ClassName com.wuyujin.webservice.server.webservice.AccountWebService
 * @Version 1.0
 * @Date: 2021/6/10 9:14 下午
 * @User leung
 * @Author yujin.wu@outlook.com
 */
@WebService(targetNamespace = "testtargetnamespace", serviceName = "testservicename", name = "testname")
public class AccountWebService {

    @WebMethod
    public String index(String name) {
        if (null == name || "".equals(name.trim())) {
            name = "wuyujin";
        }
        return String.format("%s %s webservice数据成功返回！", LocalDateTime.now(), name);
    }

    @WebMethod
    public Account getAccountByContact(Contact contact) {
        LogUtil.log("AccountWebService getAccountByContact", contact);
        Account account = new Account();

        if (contact.getQq() == null && contact.getWechat() == null && contact.getTelList() == null) {
            contact.setWechat("请输入一些信息后查询");
            account.setContact(contact);
        } else {
            // fake query
            Random random = new Random();
            Integer randomInt = random.nextInt(50);
            account.setContact(contact);
            account.setAge(randomInt);
            account.setMarried(randomInt % 2 == 0);
            account.setAccountId("kjsadfhsdfadnsfkldfkjsadldfjsadflkdsajflkssdfjhjksadfhsdakjf".substring(randomInt, randomInt + 5));
        }

        LogUtil.log("response", account, System.lineSeparator());
        return account;
    }

}
