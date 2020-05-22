package ch06;

public class r10a {

    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Urutan Array menurut algoritma Bubble sort: ");

        for (int i = 0; i < angka.length; i++) {
            for (int a = i; a < angka.length; a++){

                if(angka[i] > angka[a]){
                    int b = angka[i];
                    angka[i] = angka[a];
                    angka[a] = b;
                }
            }
        }
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + ",");

        }

    }

}