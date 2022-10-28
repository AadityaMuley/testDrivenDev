/**
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 */
public class UrinalCheck {

    static StringBuilder data;
    static int l;
    static int count;

    public static void validateString() {
        for(int i=0; i<l-1; i++) {
            if(data.charAt(i) == '1' && data.charAt(i+1) == '1') {
                count = -1;
                break;
            }
        }
    }

    public static int checkUrinals(String d) {

        data = new StringBuilder(d);
        l = data.length();
        count = 0;

        validateString();

        if(count == -1) {
            return count;
        }

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
