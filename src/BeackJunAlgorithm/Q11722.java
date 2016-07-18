package BeackJunAlgorithm;

import java.util.Arrays;
import java.util.Scanner;


/*
가장 긴 감소하는 부분 수열
https://www.acmicpc.net/problem/11722
input
6
10 30 10 20 20 10
output
3
 */
public class Q11722 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int max = 0, n;
        int []arr, dp;
        n = sc.nextInt();
        arr = new int[n];
        dp = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=n-1; i>=0; i--){
            dp[i] = 1;
            for(int j=n-1; j>i; j--){
                if(arr[i] > arr[j] && dp[i] < dp[j]+1)
                    dp[i] = dp[j] + 1;
            }
        }
        Arrays.sort(dp);
        int ans = dp[dp.length-1];
        System.out.println(ans);

    }
}
