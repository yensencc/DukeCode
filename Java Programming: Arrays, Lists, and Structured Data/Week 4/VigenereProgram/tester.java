package VigenereProgram;


/**
 * Write a description of tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;

public class tester {
    // ABCDEFGHIJKLKMNOPQRSTUVWXYZ 
    // 012345678901234567890123456
    public void test(){
    int[] rome = {17,14,12,4};
    VigenereCipher vc = new VigenereCipher (rome );
    FileResource  fr = new FileResource ();
    String message = fr.asString();
    System.out.println("Original message");
    System.out.println(message);
    System.out.println("------------******----------");
    System.out.println("Encrypted message");
    String e_message =  vc.encrypt(message);
    System.out.println(e_message);
    
    
    
    // System.out.println("------------******----------");
    // String d_message = vc.decrypt(e_message);
    // System.out.println("Dncrypted message");
     // System.out.println(d_message);
    
    
    
    

    
    }
}
