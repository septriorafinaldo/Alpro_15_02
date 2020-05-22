package ch03;
import java.util.Scanner;
public class BilanganPrima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int bil, cek = 0;
        
        System.out.print("Input Bilangan = ");
        bil = in.nextInt();
        
        for (int a = 1; a <= bil; a++) {
            if (bil % a == 0) {
                cek++;
            }
        }
                if (cek == 2) {
                    System.out.println(bil + " Bilangan Prima");
                } else {
                    System.out.println(bil + " Bukan Bilangan Prima");
                }
            }
        }