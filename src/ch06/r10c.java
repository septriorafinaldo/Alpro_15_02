package ch06;

public class r10c {

    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Urutan Array menurut Selection sort: ");

        for (int i = 0; i < angka.length; i++) {
            int a = i;

            for (int b = i; b < angka.length; b++){
                if(angka[b] < angka[a]){
                    a = b;
                }
            }
            int c = angka[i];
            angka[i] = angka[a];
            angka[a] = c;
        }
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + ",");

        }

    }

}