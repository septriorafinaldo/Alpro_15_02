package ch04;
public class Array2F{
    public static void main(String[]args){
        System.out.println("Menampilkan Angka Ganjil Yang Diapit Angka Genap : ");
        int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 0; i < array.length; i++) {
          
               if(array[i]%2==1){
                   if(array[i-1]%2==0)
                        
                   System.out.print(array[i] + " ");
          break;
           
               }   
               
            
        }
        System.out.println();
    }
}