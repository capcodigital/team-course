package com.capco.digital.engineering.greeting;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public final static String DEFAULT_GREETING = "Hello World!";

    @Override
    public String getGreeting() {
        return DEFAULT_GREETING;
    }
}
