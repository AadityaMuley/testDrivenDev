import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 */
class UrinalCheckTest {

    @Test
    void checkUrinals() {
        assertEquals(-1, UrinalCheck.checkUrinals("011"));

        boolean validate;
        for(int i=0; i<UrinalCheck.data.length(); i++) {
            validate = false;
            if(UrinalCheck.data.charAt(i) == '0' || UrinalCheck.data.charAt(i) == '1') {
                validate = true;
            }
            assertEquals(true, validate);
        }
    }
}