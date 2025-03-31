package guru.springframework.spring6di.controller.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("EN")
@SpringBootTest
class MyI18nControllerENTest {

    @Autowired
    MyI18nController myI18nController;

    @Test
    void testProfiles() {
        System.out.println(myI18nController.sayHello());
    }
}