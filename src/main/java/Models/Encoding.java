package Models;

public class Encoding {
    public String decryption(String cipher,int shift){
        String c = cipher.toLowerCase();
        char chr [] = c.toCharArray();
        int key = shift;

        int index;
        String str="";
        char plain;

        for (int i = 0; i < chr.length; i++){

            index = chr[i] -97;
            index = (index - key + 26) % 26;
            plain = (char) (index + 97);
            str = str + plain;
        }
        return str;
    }


}
