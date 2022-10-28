import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 */
public class WriteData extends UrinalMain{

    static boolean firstFile;
    static int fileNum;
    static String path;
    static File file;
    static PrintWriter fw;
    static String temp;

    public WriteData() {
        firstFile = true;
        path = "src/data/rule";
        fileNum = 1;
    }

    public static void writeFile() {

        String tempPath = "";
        try {
            file = new File("src/data/rule.txt");
            if(!file.exists()) {
                tempPath = path.concat(".txt");
                fw = new PrintWriter(tempPath, "UTF-8");
                for(int i=0; i<freeUrinals.size(); i++) {
                    temp = Integer.toString(freeUrinals.get(i));
                    fw.println(temp);
                }
                fw.close();
                //firstFile = false;
            }
            else {
                System.out.println("Bo");
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
