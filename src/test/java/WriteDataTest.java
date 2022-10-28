import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 */
class WriteDataTest {

    public static boolean pathValidity(String tempPath) {
        try{
            Paths.get(tempPath);
        }
        catch (InvalidPathException | NullPointerException ex) {
            return false;
        }
        return true;
    }

    @Test
    void writeFile() {
        //check if file already exists
        String tempPath = WriteData.path + WriteData.fileNum + ".txt";
        WriteData.file = new File(tempPath);
        assertEquals(false, WriteData.file.exists());

        //check if file name is proper format
        assertEquals(true, pathValidity(tempPath));
    }
}