package Models;

public class Encoding {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public String encoding(String plainText, int key) {
        plainText = plainText.toLowerCase();
        String PlainText = "";
        for (int i = 0; i < plainText.length(); i++) {
            int charIndex = alphabet.indexOf(plainText.charAt(i));
            int newIndex = (charIndex + key) % 26;
            char cipherChar = alphabet.charAt(newIndex);
            PlainText = PlainText + cipherChar;

        }

        return PlainText;
    }

}
