package guru.springframework.spring6di.service;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Good evening!";
    }
}
