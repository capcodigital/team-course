package com.capco.digital.engineering.greeting;

import static org.testng.Assert.assertEquals;

import org.mockito.InjectMocks;
import org.testng.annotations.Test;

import com.capco.digital.engineering.AbstractTest;

public class GreetingServiceImplTest extends AbstractTest {

    @InjectMocks
    private GreetingServiceImpl greetingServiceImpl;

    @Test
    public void testGetGreeting() {
        assertEquals(greetingServiceImpl.getGreeting(), GreetingServiceImpl.DEFAULT_GREETING);
    }

}
