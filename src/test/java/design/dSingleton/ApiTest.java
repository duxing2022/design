package design.dSingleton;

import com.demo.design.bAbstractFactory.factory.FactoryProducer;
import com.demo.design.bAbstractFactory.factory.impl.AbstractFactory;
import com.demo.design.bAbstractFactory.product.Color;
import com.demo.design.bAbstractFactory.product.Shape;
import com.demo.design.dSingleton.Singleton;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_dSingleton() throws Exception {

        Singleton singleton = Singleton.INSTANCE;

    }
}

