import java.io.*;
import java.util.Scanner;

/**
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 */
public class ParseData extends UrinalMain{

    static File file;
    static Scanner sc;

    public static boolean checkFileEmpty() {
        boolean check = true;

        try {
            BufferedReader br = null;
            br = new BufferedReader(new FileReader("src/data/urinal.dat"));
            if (br.readLine() == null) {
                check = false;
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        return check;
    }

    public static void parseData(){

        try {
            file = new File("src/data/urinal.dat");
            sc = new Scanner(file);

            boolean check = checkFileEmpty();

            if(check == true) {
                while(sc.hasNextLine()){
                    urinal.add(sc.nextLine());
                }
            }
            else {
                System.out.println("The file is empty - enter some data in the file and try again");
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
