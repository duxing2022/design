package design.aFactory;

import com.demo.design.aFactory.factory.impl.CardStoreFactory;
import com.demo.design.aFactory.product.CommodityService;
import com.demo.design.aFactory.factory.impl.CouponStoreFactory;
import com.demo.design.aFactory.factory.impl.GoodsStoreFactory;
import com.demo.design.aFactory.factory.StoreFactory;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_commodity() throws Exception {

        // 1. 优惠券
        StoreFactory storeFactory1 = new CouponStoreFactory();
        CommodityService commodityService_1 = storeFactory1.getCommodityService();
        commodityService_1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);

        // 2. 实物商品
        StoreFactory storeFactory_2 = new GoodsStoreFactory();
        CommodityService commodityService_2 = storeFactory_2.getCommodityService();
        Map<String, String> extMap = new HashMap<String, String>();
        extMap.put("consigneeUserName", "谢⻜机");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.⻓春市.双阳区.XX街道.檀溪苑⼩区.#18-2109");
        commodityService_2.sendCommodity("10001", "9820198721311", "1023000020112221113", extMap);

        // 3. 第三⽅兑换卡(爱奇艺)
        StoreFactory storeFactory_3 = new CardStoreFactory();
        CommodityService commodityService_3 = storeFactory_3.getCommodityService();
        commodityService_3.sendCommodity("10001", "AQY1xjkUodl8LO975GdfrYUio", null, null);
    }
}

