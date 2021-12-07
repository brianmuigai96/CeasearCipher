package models;

import Models.Decoding;
import Models.Encoding;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncodingTest {
    @Test
    public void encoding_allUpperCase_String() {
        Encoding newencoding = new Encoding();
        String plainText = "";
        assertEquals(plainText, newencoding.encoding("MOMBASA",1) );
    }
}
