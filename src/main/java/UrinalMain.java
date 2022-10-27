import java.util.ArrayList;

/**
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 */
public class UrinalMain {

    public static ArrayList<String> urinal = new ArrayList<String>();

    public void urinalMain() {

        ParseData parseData = new ParseData();
        parseData.parseData();

        UrinalCheck urinalCheck = new UrinalCheck();
        int count;
        for(String i : urinal){
            count = urinalCheck.checkUrinals(i);
            System.out.println(count);
        }
    }
}
