package ch05;

import java.util.Scanner;


public class r71euclidean {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        
        Scanner aldo = new Scanner (System.in);
           System.out.println("masukkan bilangan pertama=");
        x=aldo.nextInt();
       System.out.println("masukkan bilangan kedua=");
        y=aldo.nextInt();
      

        z = x % y;
        while (z != 0){
            x = y;
            y = z;
            z = x % y;
            
        }
        System.out.println("eucliden nya ialah = " + y);
        
                }
            }