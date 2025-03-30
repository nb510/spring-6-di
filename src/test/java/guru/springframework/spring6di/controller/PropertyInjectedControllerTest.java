package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() throws NoSuchFieldException {
        propertyInjectedController = new PropertyInjectedController();

        Field field = PropertyInjectedController.class.getDeclaredField("greetingService");
        field.setAccessible(true);
        ReflectionUtils.setField(field, propertyInjectedController, new GreetingServiceImpl());
    }

    @Test
    void testPropertyInjection() {
        System.out.println(propertyInjectedController.sayHello());
    }

}