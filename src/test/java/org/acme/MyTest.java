package org.acme;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class MyTest {
    @Test
    public void myTest() {
        // Empty test - we only need to start the application to make the DB connection.
    }
}
