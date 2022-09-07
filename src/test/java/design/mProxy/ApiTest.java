package design.mProxy;

import com.demo.design.mProxy.proxy.DynamicProxyHandler;
import com.demo.design.mProxy.proxy.UserControllerProxy;
import com.demo.design.mProxy.realSubject.UserControllerImpl;
import com.demo.design.mProxy.subject.UserController;
import java.lang.reflect.Proxy;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    @Test
    public void test() {
        UserController userController = new UserControllerProxy(new UserControllerImpl());
        userController.login("username", "password");
        userController.register("username", "password");
    }

    @Test
    public void test_dynamic_proxy() {
        // 1、创建具体主题类
        UserControllerImpl userController = new UserControllerImpl();
        // 2、创建 Handler
        DynamicProxyHandler proxyHandler = new DynamicProxyHandler(userController);
        // 3、动态产生代理类
        UserController o = (UserController) Proxy
                .newProxyInstance(userController.getClass().getClassLoader(), userController.getClass().getInterfaces(), proxyHandler);
        o.login("username", "password");
        o.register("username", "password");
    }
}

