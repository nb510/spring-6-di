package guru.springframework.spring6di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Inside the controller!");
        return "Hello!";
    }
}
