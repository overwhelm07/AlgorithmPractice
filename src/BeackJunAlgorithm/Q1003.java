package BeackJunAlgorithm;

import java.util.Scanner;

/**
 * 맞음
 */
public class Q1003 {
    static int cnt0, cnt1;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int T=0; T<testCase; ++T){
            int n = sc.nextInt();
            cnt0=0;cnt1=0;
            fibonacci(n);
            System.out.printf("%d %d\n", cnt0, cnt1);
        }

    }
    public static int fibonacci(int n){
        if(n==0){
            cnt0++;
            return 0;
        }else if(n==1){
            cnt1++;
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
