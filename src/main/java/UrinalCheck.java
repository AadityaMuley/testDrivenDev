/**
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 */
public class UrinalCheck {

    static StringBuilder data;
    static int l;
    static int count;

    public static int checkUrinals(String d) {

        data = new StringBuilder(d);
        l = data.length();
        count = 0;

         for(int i=0; i<l; i++) {

             if(i == 0) {
                 if(data.charAt(i) == '0' && data.charAt(i+1) == '0') {
                     count++;
                     data.setCharAt(i, '1');
                 }
             }
             else if(i == l-1) {
                 if(data.charAt(i) == '0' && data.charAt(i-1) == '0') {
                     count++;
                     data.setCharAt(i, '1');
                 }
             }
             else {
                 if(data.charAt(i) == '0' && data.charAt(i-1) == '0' && data.charAt(i+1) == '0') {
                     count++;
                     data.setCharAt(i, '1');
                 }
             }

         }

         return count;
    }
}
