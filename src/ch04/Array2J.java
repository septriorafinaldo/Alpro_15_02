package ch04;
public class Array2J{
   public static void main(String[]args) {
        System.out.println("Menampilkan Array Bilangan Genap : ");
		int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int hasil = 0;
        for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				for (int j = i + 1; j  < array.length-1; j++) {
					if(array[j]%2==0){
					hasil=array[i]-array[j];
					System.out.println("Angka Sebelum : " +array[i]);
					System.out.println("Angka Sesudah : " +array[j]);
					System.out.println("Selisih : " + hasil);
					break;
					}
					  

				}
            }
        }
        System.out.println();
    }
}