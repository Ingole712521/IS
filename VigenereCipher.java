public class VigenereCipher {
    public static void main(String...s){
    char msg[] = {'R', 'A', 'V', 'I'};
    char key[] = {'H', 'E', 'L', 'L', 'O'};
    int msgLen = msg.length, i, j;
    char newKey[] = new char[msgLen];
    char encryptedMsg[] = new char[msgLen];
    char decryptedMsg[] = new char[msgLen];
    for(i = 0, j = 0; i < msgLen; ++i, ++j){
    if(j == key.length)
    j = 0;
    newKey[i] = key[j];
    }
    for(i = 0; i < msgLen; ++i)
    encryptedMsg[i] = (char)(((msg[i] + newKey[i]) % 26) + 'A');
    for(i = 0; i < msgLen; ++i)
    decryptedMsg[i] = (char)((((encryptedMsg[i] - newKey[i]) + 26) % 26) + 'A');
    System.out.println("Original Message: " + String.valueOf(msg)); 
    System.out.println("Key: " + String.valueOf(key));
    System.out.println("Generated Key: " + String.valueOf(newKey));
    System.out.println("\nEncrypted Message: " + String.valueOf(encryptedMsg));
    System.out.println("\nDecrypted Message: " + String.valueOf(decryptedMsg));
    }}
    