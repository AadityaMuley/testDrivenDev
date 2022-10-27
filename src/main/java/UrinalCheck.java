/**
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 */
public class UrinalCheck {

    String data;
    int l;
    int count = 0;

    public void checkValidity() {
        for(int i=0; i<l; i++) {
            if(data.charAt(i) != '0' || data.charAt(i) != '1'){
                count = -1;
                break;
            }
        }
    }

    public int checkUrinals(String data) {

        this.data = data;
        l = data.length();
        checkValidity();

        if(((data.charAt(0) == '0') && (data.charAt(1) == '0')) || ((data.charAt(l-1) == '0') && (data.charAt(l-2) == '0'))){
        }
         for(int i=0; i<l-1; i++){
         }

         return count;
    }
}
