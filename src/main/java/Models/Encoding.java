package Models;

public class Encoding {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encoding(String plainText, int key) {
        plainText = plainText.toLowerCase();
        String store = "";
        for (int i = 0; i < plainText.length(); i++) {
            int charIndex = alphabet.indexOf(plainText.charAt(i));
            int newIndex = (charIndex + key) % 26;
            char cipherChar = alphabet.charAt(newIndex);
            store = store + cipherChar;

        }

        return store;
    }

}
