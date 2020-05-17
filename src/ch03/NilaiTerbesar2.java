package ch03;
import java.util.Scanner;
public class NilaiTerbesar2{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan X: ");
		int x = input.nextInt();
		System.out.print("Masukkan Y: ");
		int y = input.nextInt();
		System.out.print("Masukkan Z: ");
		int z = input.nextInt();
		
		if (x>y && x>z){
			System.out.println("X lebih besar dari Y dan Z");
		}
		else if(y>x && y>z){
			System.out.println("Y lebih besar dari X dan Z");
		}
		else{
			System.out.println("X, Y, dan Z sama besar");
		}
	}
}