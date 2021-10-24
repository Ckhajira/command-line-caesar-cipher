import java.io.Console;
import models.Encrypt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App{
    public static void main(String[] args){

        boolean running = true;

        while(running){
            System.out.println("This is a direct line to the President and all communication is top secret! ");
            System.out.println("Would you like to encrypt a message or decrypt a message you have received?");
            System.out.println("To encrypt a message, enter option 1. To decrypt a message, enter option 2. To " +
                    "exit, enter option 3");
            Console myConsole = System.console();
            String choice = myConsole.readLine();
            if(choice.equals("1")){
                System.out.println("Enter message for encryption:");
                String text = myConsole.readLine();
                System.out.println("Enter encryption key:");
                int shift = Integer.parseInt(myConsole.readLine());

                Encrypt newEncryption = new Encrypt(text, shift);
                System.out.println("Your encrypted message is: "+ newEncryption.encryptMessage(text, shift));

            }
            else if(choice.equals("2")){
                System.out.println("Enter message for decryption:");
                String text = myConsole.readLine();
                System.out.println("Enter decryption key:");
                int shift = Integer.parseInt(myConsole.readLine());

                Decrypt newDecryption = new Decrypt(text,shift);
                System.out.println("Your decrypted message is: "+ newDecryption.decryptMessage(text, shift));

            }
        }
    }
}