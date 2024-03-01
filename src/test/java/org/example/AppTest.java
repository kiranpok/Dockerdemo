package org.example;


import org.junit.Test;
import static junit.framework.Assert.assertEquals;


public class AppTest {
    App app = new App();
    @Test
    public void addTest() {
        assertEquals(3, app.add(1, 2));
    }


}
