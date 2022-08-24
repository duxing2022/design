package design.kFacade;

import com.demo.design.jDecorator.ConcreteComponent.SsoInterceptor;
import com.demo.design.jDecorator.ConcreteDecorator.LoginSsoDecorator;
import com.demo.design.kFacade.facade.ComputerFacade;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    @Test
    public void test_kFacade() {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
    }
}

