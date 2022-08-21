package design.gBridge;

import com.demo.design.gBridge.abstraction.Pay;
import com.demo.design.gBridge.concreteImplementor.WxPay;
import com.demo.design.gBridge.concreteImplementor.ZfbPay;
import com.demo.design.gBridge.refinedAbstraction.PayFaceMode;
import com.demo.design.gBridge.refinedAbstraction.PayFingerprintMode;
import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    @Test
    public void test_gBridge() {
        log.info("\r\n模拟测试场景；微信⽀付、⼈脸⽅式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        log.info("\r\n模拟测试场景；⽀付宝⽀付、指纹⽅式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111", "100000109894", new BigDecimal(100));
    }
}

