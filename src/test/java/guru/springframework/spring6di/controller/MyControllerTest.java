package guru.springframework.spring6di.controller;

import org.junit.jupiter.api.Test;


class MyControllerTest {

    @Test
    void testTightCoupling() {
        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}