package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {

    private Encrypt myTest = new Encrypt("Encryption", 2);

    @Test

    public void runEncrypt_instantiate(){

        assertTrue(myTest instanceof Encrypt);
    }

    @Test
    public void runEncrypt_checkForText(){

        assertEquals("Encryption",myTest.getText());
    }
    @Test
    public void runEncrypt_checkForShift(){

        assertEquals(2,myTest.getShift());
    }
    @Test
    public void runEncrypt_EncryptUserText(){
        assertEquals("Lipps",myTest.encryptMessage("Hello", 4));
    }
}