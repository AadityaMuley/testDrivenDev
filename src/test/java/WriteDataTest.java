import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 */
class WriteDataTest {

    @Test
    void writeFile() {
        String tempPath = WriteData.path + WriteData.fileNum + ".txt";
        WriteData.file = new File(tempPath);
        assertEquals(false, WriteData.file.exists());
    }
}