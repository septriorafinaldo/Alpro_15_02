package ch05;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class r74lis {

  public static void main(String[] args) throws FileNotFoundException {
    int a [] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 13, 3, 11, 15};

  
     
   
     System.out.println("deret ils = " + lis2(a));
    

  }

  private static int lis2(int[] a) {
     List<Integer> lis = new ArrayList<>();
     lis.add(a[0]);
     for (int i = 1; i < a.length; i++)
        if (a[i] > lis.get(lis.size() - 1))
           lis.add(a[i]);
        else if (a[i] < lis.get(0))
           lis.set(0, a[i]);
        else
           lis.set(binarySearch(lis, a[i]), a[i]);
     System.out.println("hasil ils = " + lis);
     return lis.size();
     
     
  }

 
  private static int lis3(int[] a) {
     int[] lis = new int[a.length];
     int lastIndex = 0;
     lis[lastIndex] = a[0];
     for (int i = 1; i < a.length; i++)
        if (a[i] > lis[lastIndex])
           lis[++lastIndex] = a[i];
        else if (a[i] < lis[0])
           lis[0] = a[i];
        else
           lis[binarySearch(lis, 0, lastIndex, a[i])] = a[i];
     return lastIndex + 1;
  }

  
  private static int lis(int[] arr) {
     int max = -1;
     int[] lis = new int[arr.length];
     lis[0] = 1;
     for (int i = 1; i < arr.length; i++)
        for (int j = 0; j < i; j++)
           if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
              lis[i] = lis[j] + 1;
              max = Math.max(max, lis[i]);
           }
     return max;
  }

  private static int binarySearch(int[] a, int low, int high, int key) {
     while (low <= high) {
        int mid = (low + high) >>> 1;
        int midVal = a[mid];
        if (midVal < key)
           low = mid + 1;
        else if (midVal > key)
           high = mid - 1;
        else
           return mid; 
     }
     return low; 
  }

  private static int binarySearch(List<Integer> a, int key) {
     int low = 0;
     int high = a.size() - 1;
     while (low <= high) {
        int mid = (low + high) >>> 1;
        int midVal = a.get(mid);
        if (midVal < key)
           low = mid + 1;
        else if (midVal > key)
           high = mid - 1;
        else
           return mid; 
     }
     return low;
  }

}
