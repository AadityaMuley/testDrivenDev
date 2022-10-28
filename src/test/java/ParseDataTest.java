import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 */
class ParseDataTest {

    @Test
    void parseData() {
        //check if the input file exists
        ParseData.parseData();
        assertNotNull(ParseData.file);
    }

    @Test
    void checkFileEmpty() {
        //check if the input file is not empty
        ParseData.parseData();
        assertEquals(true, ParseData.checkFileEmpty());
    }
}