package ch04;
public class Array2C{
   public static void main(String[]args) {
        System.out.println("Menampilkan Array Bilangan Ganjil : ");
		int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {

                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}