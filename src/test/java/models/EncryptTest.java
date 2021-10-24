package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {

    private Encrypt myTest = new Encrypt("Encryption", 2);

    @Test

    public void runEncrypt_instantiate(){
        assertTrue(myTest instanceof Encrypt);
    }
    
}