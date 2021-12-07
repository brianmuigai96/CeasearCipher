package Models;

public class Decoding {

    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public  String decoding(String decodeText, int key) {
        decodeText = decodeText.toLowerCase();
        decodeText = "";
        for (int i = 0; i < decodeText.length(); i++) {
            int charIndex = alphabet.indexOf(decodeText.charAt(i));
            int newIndex = (charIndex - key) % 26;
            if (newIndex < 0) {
                newIndex = alphabet.length() + newIndex;
            }
            char plainChar = alphabet.charAt(newIndex);
            decodeText = decodeText + plainChar;

        }

        return decodeText;

    }
}
