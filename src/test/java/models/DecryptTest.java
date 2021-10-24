package models;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecryptTest {
    private Decrypt myTest = new Decrypt("Encryption", 5);

    @Test

    public void runDecrypt_instantiate() {
        assertTrue(myTest instanceof Decrypt);
    }

    @Test
    public void runDecrypt_checkForText() {
        assertEquals("Encryption", myTest.getText());
    }
    @Test
    public void runDecrypt_checkForShift() {
        assertEquals(5,myTest.getShift());
    }

}