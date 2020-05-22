package ch05;

import java.util.Scanner;

public class r73lcs {
    public static int LCS(String pertama, String kedua, int x, int i){

        if (x == 0 || i == 0) {
            return 0;
        }
        if (pertama.charAt(x - 1) == kedua.charAt(i - 1)){
            return LCS(pertama, kedua, x-1, i-1)+1;
        }
        return Integer.max(LCS(pertama, kedua, x, i-1), LCS(pertama, kedua, x - 1, i));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        String b;

        System.out.print("Masukkan Karakter pertama: ");
        a = in.nextLine();
        System.out.print("Masukkan Karakter kedua: ");
        b = in.nextLine();

        System.out.println("Karakter Yang Sama ada: " + LCS(a, b, a.length(), b.length()));
    }
}