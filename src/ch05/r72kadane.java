package ch05;

public class r72kadane {
 

 public int kandaneForMaxSubArray(int[] arr) {
  int maxEndHere = 0;
  int maxSoFar = 0;
  for (int i = 0; i < arr.length; i++) {
   maxEndHere += arr[i];
   if (maxEndHere < 0) {
    maxEndHere = 0;
   }
   if (maxSoFar < maxEndHere) {
    maxSoFar = maxEndHere;
   }
  }
  return maxSoFar;
 }

 public int kandaneForMaxSubArrayForNegativ(int[] arr) {
  int maxEndHere = arr[0];
  int maxSoFar = arr[0];
  for(int i=1;i<arr.length;i++){
   maxEndHere = Math.max(arr[i], maxEndHere+arr[i]);
   maxSoFar = Math.max(maxSoFar,maxEndHere);
  }
  return maxSoFar;
 }
 
 public static void main(String args[]) {
  int arr[] = { 11, 2, -3, -10, -2, -7, 10, 13, };
  r72kadane maxSum = new r72kadane();
  System.out.println("nilai Maximum arrray = " + maxSum.kandaneForMaxSubArray(arr));
  int arrNeg[] = { -10, -25, -3, -15, -9, -7, -8, -19 };
  System.out.println("nilai maksimal array jika semua elementt negatif : " + maxSum.kandaneForMaxSubArrayForNegativ(arrNeg));
 }
}