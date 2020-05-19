public class Selection_Sort {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        for(int i = 0; i < angka.length - 1; i++){
            int index = i;
            for(int j = i + 1; j < angka.length; j++){
                if(angka[j] < angka[index]){
                    index = j;
                }
            }
            int angka_terkecil = angka[index];
            angka[index] = angka[i];
            angka[i] = angka_terkecil;
        }
        for(int i = 0; i < angka.length; i++){
            System.out.print(angka[i] + " ");
        }
}
}