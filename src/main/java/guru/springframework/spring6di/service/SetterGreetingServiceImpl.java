package guru.springframework.spring6di.service;

import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from the Setter!";
    }
}
