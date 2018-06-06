package com.capco.digital.engineering.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final static String GREETING_ENDPOINT = "/helloWorld";

    @Autowired
    private GreetingService greetingService;

    @RequestMapping(value = GREETING_ENDPOINT, method = RequestMethod.GET)
    public ResponseEntity<GreetingResponse> getGreeting() {

        GreetingResponse response = new GreetingResponse();

        response.setMessage(greetingService.getGreeting());

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

}
