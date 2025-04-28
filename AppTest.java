package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void testAppHasHelloWorldMessage() {
        App app = new App();
        String output = app.getMessage();
        assertTrue(output.contains("Hello"));
    }
}
 AppTest {
    
}
