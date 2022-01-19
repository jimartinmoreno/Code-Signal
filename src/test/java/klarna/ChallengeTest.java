package klarna;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChallengeTest {

    // These example test cases are editable, feel free to add
    // your own tests to debug your code.

    @Test
    public void shouldSayHello() {
        Assertions.assertEquals("Hello, Qualified!", Challenge.sayHello("Qualified"));
        Assertions.assertEquals("Hello there!", Challenge.sayHello(null));
        Assertions.assertEquals("Hello there!", Challenge.sayHello(""));
    }



}