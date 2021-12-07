package models;


import Models.Decoding;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodingTest {

    @Test
    public void encoding_allUpperCase_String() {
        Decoding newdecoding = new Decoding();
        String decodeText = "";
        assertEquals(decodeText, newdecoding.decoding("MOMBASA",1) );
    }




}
