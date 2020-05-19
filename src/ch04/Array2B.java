package ch04;
import java.util.Scanner;
public class Array2B{
    public static void main(String[]args) {
        System.out.println("82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3");
		int flag = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Elemen Array : ");
		int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int x = scan.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("Elemen ditemukan pada posisi : " + i);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Elemen " + x + " Tidak Ditemukan");
        }
    }
}