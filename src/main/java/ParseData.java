import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 */
public class ParseData extends UrinalMain{

    static File file;
    static Scanner sc;

    public static void parseData(){

        try {
            file = new File("src/data/urinal.dat");
            sc = new Scanner(file);

            while(sc.hasNextLine()){
                urinal.add(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
