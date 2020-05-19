public class Insertion_Sort {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int j, k;
        for(int i = 1; i < angka.length; i++){
            k = angka[i];
            j = i - 1;
            
            while(j >= 0 && angka[j] > k){
                angka[j+1] = angka[j];
                j = j - 1;
            }
            
            angka[j + 1] = k;
        } 
        for(int i = 0; i < angka.length; i++){
            System.out.print(angka[i] + " ");
        } 
    }   
}