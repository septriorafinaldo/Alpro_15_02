
public class Array2I{
    public static void main(String[]args){
        int sum,hasil;
        int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        hasil = 0;
        System.out.println("Menampilkan Selisih Angka - Angka dengan Angka Setelahnya : ");
        for (int i = 0; i  < array.length-1; i++) {
            if(array.length-1< array.length){
                  hasil=array[i+1]-array[i];
            }             
            
            System.out.println("Angka Sebelum : " +array[i]);
            System.out.println("Angka Sesudah : " +array[i+1]);
              System.out.println("Selisih : " +hasil);   
        }
    }
}