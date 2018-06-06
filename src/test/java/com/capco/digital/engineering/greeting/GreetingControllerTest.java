package com.capco.digital.engineering.greeting;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.testng.annotations.Test;

import com.capco.digital.engineering.AbstractTest;

public class GreetingControllerTest extends AbstractTest {

    @InjectMocks
    private GreetingController controller = new GreetingController();

    @Mock
    private GreetingService greetingService;

    @Test
    public void testPostCheckEmail() {
        when(greetingService.getGreeting()).thenReturn(GreetingServiceImpl.DEFAULT_GREETING);

        ResponseEntity<GreetingResponse> response = controller.getGreeting();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(response.getBody().getMessage(), GreetingServiceImpl.DEFAULT_GREETING);
    }

}
