package models;


import Models.Decoding;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodingTest {

    @Test
    public void encoding_allUpperCase_String() {
        Decoding newDecoding = new Decoding();
        String decodeText = "";
        assertEquals(decodeText, newDecoding.decoding("MOMBASA",1) );
    }


}
