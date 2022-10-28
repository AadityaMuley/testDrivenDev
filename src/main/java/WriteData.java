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

    static int fileNum;
    static String path;
    static File file;
    static PrintWriter fw;
    static String temp;

    public WriteData() {
        path = "src/output/rule";
        fileNum = 1;
    }

    public static void writeFile() {

        try {
            String tempPath = "";

            tempPath = path + ".txt";
            file = new File(tempPath);

            if(!file.exists()) {
                fw = new PrintWriter(tempPath, "UTF-8");

                for(int i=0; i<freeUrinals.size(); i++) {
                    temp = Integer.toString(freeUrinals.get(i));
                    fw.println(temp);
                }
                fw.close();
            }
            else {
                while(true) {
                    tempPath = path + fileNum + ".txt";
                    fileNum++;
                    file = new File(tempPath);

                    if(!file.exists()) {
                        fw = new PrintWriter(tempPath, "UTF-8");

                        for(int i=0; i<freeUrinals.size(); i++) {
                            temp = Integer.toString(freeUrinals.get(i));
                            fw.println(temp);
                        }
                        fw.close();
                        break;
                    }
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
