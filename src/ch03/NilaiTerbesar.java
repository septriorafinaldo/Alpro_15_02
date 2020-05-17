package ch03;
import java.util.Scanner;
public class NilaiTerbesar{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan X: ");
		int x = input.nextInt();
		System.out.print("Masukkan Y: ");
		int y = input.nextInt();
		
		int total =x-y;
		if(total>0){
			System.out.println("X lebih besar dari Y");
		}
		else if(total==0){
			System.out.println("Y lebih besar dari X");
		}
	}
}