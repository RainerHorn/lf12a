package mmbbs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */

    @Test
    void testApp() {
        Check c1 = new Check();
        assertEquals(true, c1.validIPAddress("1.2.3.4"));  
        assertNotEquals(true, c1.validIPAddress("267.2.3.4"));       
    }

   
    
}
