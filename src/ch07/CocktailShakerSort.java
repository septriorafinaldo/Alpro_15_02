public class CocktailShakerSort {
    private CocktailShakerSort(int[] array) {
        int n = array.length;
        for (int j = 1;j<n;j++) {
            int key = array [j];
            int i=j-1;
            while ((i>-1)&&(array[i]>key)){
                array[i+1] = array[i];
                i--;
            }
            array[i+1]=key;
        }
    }
    private int[] array;

    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        //mengurutkan array menggunakan Cocktail Shaker Sort

        System.out.println("sebelum cocktail shaker sort");
        for (int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        new CocktailShakerSort(array);
        //Piih array Menggunakan merge sort

        System.out.println("setelah dipilih cocktail shaker sort");
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}