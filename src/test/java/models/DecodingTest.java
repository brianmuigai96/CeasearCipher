package models;


import Models.Decoding;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class DecodingTest {
    @Test
    public void ceaserCipher_instanceof_Object() {
        Decoding newDecoding = new Decoding();
        assertTrue(newDecoding instanceof Decoding);
    }

    @Test
    public void encoding_allUpperCase_String() {
        Decoding newDecoding = new Decoding();
        String decodeText = "";
        assertEquals(decodeText, newDecoding.decoding("MOMBASA",1) );
    }


}
