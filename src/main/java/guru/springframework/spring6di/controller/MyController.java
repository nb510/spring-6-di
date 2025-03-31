package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.GreetingService;
import guru.springframework.spring6di.service.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("Inside the controller!");
        return greetingService.sayGreeting();
    }

    public void beforeInit() {
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("## - After init called by Bean Post Processor");
    }
}
