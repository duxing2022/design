package design.fAdapter;

import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONUtil;
import com.demo.design.fAdapter.RebateInfo;
import com.demo.design.fAdapter.adaptee.Account;
import com.demo.design.fAdapter.adaptee.OrderMq;
import com.demo.design.fAdapter.adapter.MqAdapter;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    @Test
    public void test_fAdapter() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Account create_account = new Account();
        create_account.setNumber("100001");
        create_account.setAddress("河北省.廊坊市.⼴阳区.⼤学⾥职业技术学院");
        create_account.setAccountDate(DateUtil.now());
        create_account.setDesc("在校开户");

        HashMap<String, String> link01 = new HashMap<>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MqAdapter.filter(create_account.toString(), link01);
        log.info("mq.create_account(适配前) {}", create_account.toString());
        log.info("mq.create_account(适配后) {}", JSONUtil.toJsonStr(rebateInfo01));
        log.info("");

        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(DateUtil.now());
        HashMap<String, String> link02 = new HashMap<>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RebateInfo rebateInfo02 = MqAdapter.filter(orderMq.toString(), link02);
        log.info("mq.orderMq(适配前) {}", orderMq.toString());
        log.info("mq.orderMq(适配后) {}", JSONUtil.toJsonStr(rebateInfo02));
    }
}

