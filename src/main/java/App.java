
import Models.Decoding;
import Models.Encoding;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Encoding testEncoding = new Encoding();
        Decoding testDecoding = new Decoding();
        System.out.println("Enter message:");
        String plain = scan.nextLine();
        System.out.println("Enter Key:");
        int key = scan.nextInt();
        String cipherText = testEncoding.encoding(plain, key);
        System.out.println("The cipher text:" + cipherText);
        System.out.println("The decipher message is:" + testDecoding.decoding(cipherText, key));

    }
}





