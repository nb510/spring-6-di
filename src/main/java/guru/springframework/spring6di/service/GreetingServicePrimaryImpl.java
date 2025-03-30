package guru.springframework.spring6di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimaryImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Very Primary Greeting!";
    }
}
