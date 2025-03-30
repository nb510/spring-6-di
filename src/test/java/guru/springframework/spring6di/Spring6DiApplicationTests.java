package guru.springframework.spring6di;

import guru.springframework.spring6di.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test
    void testAutowiredBean() {
        System.out.println(myController.sayHello());
    }

    @Test
    void testBeanFromTheContext() {
        MyController bean = applicationContext.getBean(MyController.class);
        System.out.println(bean.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
