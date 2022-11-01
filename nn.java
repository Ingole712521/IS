import java.util.*;  
class DiffieHellman {      
    public static void main(String[] args)  
    {  
        long B, D, a, x, b, y, Nx, Ny;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Both the users should be agreed upon the public keys B and D");  
        System.out.println("Enter value for public key B:");  
        B = sc.nextLong();  
        System.out.println("Enter value for public key D:");  
        D = sc.nextLong();  
        System.out.println("Enter value for private key x selected by user1:");  
        x = sc.nextLong();  
        System.out.println("Enter value for private key y selected by user2:");  
        y = sc.nextLong();  
        a = calculatePower(D, x, B);  
        b = calculatePower(D, y, B);   
        Nx = calculatePower(b, x, B);    
        Ny = calculatePower(a, y, B);   
        System.out.println("Secret key for User1 is:" + Nx);  
        System.out.println("Secret key for User2 is:" + Ny);  
    }   
    private static long calculatePower(long a, long b, long D)  
    {  
        long result = 0;          
        if (b == 1){  
            return a;  
        }  
        else{ 
            result = ((long)Math.pow(a, b)) % D;  
            return result;  
        }  
    }     
}  
