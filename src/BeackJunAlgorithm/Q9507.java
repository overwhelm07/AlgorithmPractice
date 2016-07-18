package BeackJunAlgorithm;

import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 4. 12..
 */
public class Q9507 {

    static long[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int T = 1; T <= testCase; ++T) {
            int n = sc.nextInt();
            arr = new long[n+1];
            long ans = fibo(n);
            System.out.println(ans);
        }
    }

    public static long fibo(int n) {
        if (arr[n] != 0) {
            return arr[n];
        } else if (n < 2) {
            arr[n] = 1;
            return 1;
        } else if (n == 2) {
            arr[n] = 2;
            return 2;
        } else if (n == 3) {
            arr[n] = 4;
            return 4;
        } else {
            arr[n] = fibo(n - 1) + fibo(n - 2) + fibo(n - 3) + fibo(n - 4);
            return fibo(n - 1) + fibo(n - 2) + fibo(n - 3) + fibo(n - 4);
        }
    }
}
