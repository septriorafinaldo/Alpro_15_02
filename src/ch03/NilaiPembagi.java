package ch03;
import java.util.Scanner;
public class NilaiPembagi{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Bilangan: ");
		int bil = input.nextInt();
		
		for (int i = 3; i <bil; i++){
			if (bil % i ==0){
				System.out.println(i);
			}
		}
	}
}