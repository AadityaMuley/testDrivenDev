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
        //check if there are consecutive 1's in the string
        assertEquals(-1, UrinalCheck.checkUrinals("011"));

        //check if the string has any other char except 1 or 0
        boolean validate = false;
        for(int i=0; i<UrinalCheck.data.length(); i++) {
            validate = false;
            if(UrinalCheck.data.charAt(i) == '0' || UrinalCheck.data.charAt(i) == '1') {
                validate = true;
            }
        }
        assertEquals(true, validate);

        //check if string is not null
        assertNotEquals(null, UrinalCheck.data);
    }
}