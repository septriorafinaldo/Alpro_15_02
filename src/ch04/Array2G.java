package ch04;
public class Array2G{
public static void main(String[]args){
        System.out.println("Menampilkan Array Kelipatan 5 Yang Elemen Sebelumnya kelipatan 5 : ");
		  int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
				if(array[i-1]%5==0)
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}