package ch04;

public class Array2N {
    public static void main(String[] args) {
        int[] array1 = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int hasil = 0;

        for (int i = 0; i < array1.length; i++) {

            System.out.print("Penjumlah " + array1[i] + " dengan angka sebelumnya = ");

            System.out.println(array1[i] + hasil);

            hasil = hasil + array1[i];

        }
    }
}