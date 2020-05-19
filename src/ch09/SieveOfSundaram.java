import java.util.Arrays;
public class SieveOfSundaram {
    static int SieveOfSundaram(int n) {
        int nNew = (n - 2) / 2;
        boolean marked[] = new boolean[nNew + 1];
        Arrays.fill(marked, false);
        for (int i = 1; i <= nNew; i++)
            for (int j = i; (i + j + 2 * i * j) <= nNew; j++)
                marked[i + j + 2 * i * j] = true;
        //2 adalah bilangan prima
        if (n > 2)
            System.out.print(2 + " ");
        for (int i = 1; i <= nNew; i++)
            if (marked[i] == false)
                System.out.print(2 * i + 1 + " ");
        return -1;
    }
    // Driver code
    public static void main(String[] args) {
        int n = 20;
        SieveOfSundaram(n);
    }
}