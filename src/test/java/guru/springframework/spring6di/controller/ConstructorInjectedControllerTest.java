package guru.springframework.spring6di.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController constructorInjectedController;

    @Test
    void testConstructorInjected() {
        System.out.println(constructorInjectedController.sayHello());
    }

}