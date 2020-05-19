import java.util.Scanner;

public class Euclidean {
    public static void main(String[] args) {
        int a,b,x,bil1,bil2,d = 0,kecil;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Mencari FPB Dengan Algoritma Euclidean");
        System.out.println("========");
        System.out.print("Masukkan Bilangan Pertama = ");
        bil1 = scan.nextInt();
        
        System.out.print("Masukkan Bilangan Kedua = ");
        bil2 = scan.nextInt();
        
        if (bil1>bil2){
            kecil=bil2;
            
        }else {
            kecil=bil1;
        }
        
        for (x=1;x<=kecil;x++){
            a=bil1%x;
            b=bil2%x;
            
            if(a==0 && b==0){
                d=x;
            }
        }
        System.out.print("FBB dari "+bil1+" dan "+bil2+" Adalah = "+d);
    }
}