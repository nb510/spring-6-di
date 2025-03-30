package guru.springframework.spring6di;

import guru.springframework.spring6di.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        System.out.println("Inside main");

        MyController myController = (MyController) ctx.getBean("myController");
        String result = myController.sayHello();
        System.out.println(result);
    }

}
