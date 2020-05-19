 package ch04;
 public class Array2E{   
	public static void main(String[]args) {
        String pref1="2";
        
        System.out.println("Menampilkan Array Yang Memiliki Angka 2 : ");
        int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 0; i < array.length; i++) {
           
              if(String.valueOf(array[i]).startsWith(pref1) || String.valueOf(array[i]).endsWith(pref1)){
                  System.out.print(array[i] + " ");
                  
              }
            
        }
        System.out.println();
    }
 }