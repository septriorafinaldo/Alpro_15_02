package ch04;

public class Array2M {
    public static void main(String[] args) {
        int[] array1 = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int jml, hasil = 0;

        System.out.print("Penjumlahan selisih angka pada poin I adalah = ");
        for (int i = 1; i < array1.length; i++){
            jml = array1[i-1] - array1[i];
            hasil += jml;
        }
        System.out.println(hasil);
    }
}