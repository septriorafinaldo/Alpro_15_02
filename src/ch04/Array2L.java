package ch04;
public class Array2L {
        public static void main(String[]args) {
            System.out.println("Hasil angka dengan angka setelahnya yang hasilnya genap : ");
            int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
            for (int i = 0; i < array.length-1; i++) {
                int hasil = array[i] + array[i+1];
                if (hasil % 2 ==0)
                    System.out.println(hasil);

            }
            System.out.println();
        }
    }