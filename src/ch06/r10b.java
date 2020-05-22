package ch06;

public class r10b {

    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Urutan Array menurut Insertion sort: ");

        for (int i = 0; i < angka.length; i++) {
            for (int a = i; a >= 1; a--){
                if(angka[a] > angka[a - 1]){
                    break;
                }
                int b = angka[a];
                angka[a] = angka[a - 1];
                angka[a - 1] = b;
            }
        }
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + ",");

        }

    }

}