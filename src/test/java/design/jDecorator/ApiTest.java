package design.jDecorator;

import com.demo.design.jDecorator.ConcreteComponent.SsoInterceptor;
import com.demo.design.jDecorator.ConcreteDecorator.LoginSsoDecorator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    @Test
    public void test_jDecorator() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        log.info("登录校验：{} {}", request, (success ? " 放⾏" : " 拦 截"));
    }
}

