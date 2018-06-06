package com.capco.digital.engineering.greeting;

import static org.testng.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(classes = { GreetingConfig.class })
public class GreetingIntTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private GreetingController controller;

    @Test
    public void testGetGreeting() {
        ResponseEntity<GreetingResponse> response = controller.getGreeting();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(response.getBody().getMessage(), GreetingServiceImpl.DEFAULT_GREETING);
    }

}
