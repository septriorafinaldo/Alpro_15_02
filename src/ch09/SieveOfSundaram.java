package ch09;
import java.util.Arrays; 
import java.util.Scanner;

public class sieveofsundaram {
static int SieveOfSundaram(int n) { 
 
    int nNew = (n - 2) / 2; 
    boolean marked[] = new boolean[nNew + 1];    
    Arrays.fill(marked, false); 
  
   
    for (int i = 1; i <= nNew; i++) 
    for (int j = i; (i + j + 2 * i * j) <= nNew; j++) 
        marked[i + j + 2 * i * j] = true; 
  
    if (n > 2) 
    System.out.print(2 + " "); 
  
    for (int i = 1; i <= nNew; i++) 
    if (marked[i] == false) 
        System.out.print(2 * i + 1 + " "); 
    return -1; 
} 
public static void main(String[] args) { 
    Scanner sc = new Scanner (System.in);
    System.out.println("Masukkan bilangan = ");
    int n = sc.nextInt(); 
    SieveOfSundaram(n); 
} 
}     

