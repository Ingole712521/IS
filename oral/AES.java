package oral;

import java.lang.System.Logger;

import javax.crypto.Cipher;


public class AES {
    private static final String ALGO = "AES";
        
    private byte[] Keyvalue;
    
    public AES(String Key){
        Keyvalue = Key.getBytes();
    }

    public String encrypt (String Data) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance (ALGO);
        c.init (Cipher .ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(Data.getBytes();
        String encryptedValue = new BASE64Encoder () .encode (encVal);
        return encryptedValue;
    }
    public String encrypt (String Data) throws Exception {
        Key key = generateKey();
        Cipher c¢ = Cipher.getInstance (ALGO);
        c.init (Cipher .ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(Data.getBytes();
        String encryptedValue = new BASE64Encoder () .encode (encVal);
        return encryptedValue;
    }
    private Key generateKey() throws Exception {
        Key key = new SecretKeySpec (keyValue, ALGO);
        return key;
        }
        public static void main(String args[]) {
        try {
        AESExample aes = new AESExample ("1v39ept lvuhaqqsrl") ;
        String encdata = aes.encrypt ("Amarnath") ;
        System.out.println("Encrypted Data - " + encdata);
        String decdata = aes. decrypt (encdata) ;
        System. out.println("Decrypted Data - " + decdata);
     } catch (Exception ex) {

Logger .getLogger (AESExample.class.getNawe () ) . log(Level.SEVERE, null, ex);
}

}
        


}
