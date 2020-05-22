package ch09;
import java.util.Scanner;


public class sieveoferathosenes {
  

    void sieveOfEratosthenes(int n) 
    { 
        
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) { 
            
            if(prime[p] == true) 
            { 
                
                for(int i = p*2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
          
       
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true) 
                System.out.print(i + " "); 
        } 
    } 
      
    
    public static void main(String args[])  { 
        
        Scanner sc = new Scanner (System.in);
         System.out.print("masukkan bilangan prima = "); 
      int n = sc.nextInt();
        
     
        
        System.out.println("sieve of erathosenes dari " + n); 
        sieveoferathosenes g = new sieveoferathosenes(); 
        g.sieveOfEratosthenes(n); 
    } 
} 

