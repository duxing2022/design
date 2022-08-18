package design.dSingleton;

import com.demo.design.dSingleton.Singleton;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    @Test
    public void test_dSingleton() {

        log.info(String.valueOf(Singleton.INSTANCE.hashCode()));
        log.info(String.valueOf(Singleton.INSTANCE.hashCode()));

    }
}

