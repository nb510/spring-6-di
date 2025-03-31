package guru.springframework.spring6di.service;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override

    public String sayGreeting() {
        return "Hello from the property injection, everyone hates me =(";
    }
}
