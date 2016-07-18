package DP;

import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 5. 26..
 */
public class Q1149RGB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dp[][] = new int[n][3];
        int color[][] = new int[n][3];
        for(int i=0; i<n; i++){
            color[i][0] = sc.nextInt();
            color[i][1] = sc.nextInt();
            color[i][2] = sc.nextInt();
        }
        dp[0][0] = color[0][0];
        dp[0][1] = color[0][1];
        dp[0][2] = color[0][2];

        if(n > 0){
            for(int i=1; i<n; i++){
                //R
                if(dp[i-1][1] < dp[i-1][2]){
                    dp[i][0] = dp[i-1][1] + color[i][0];
                }else{
                    dp[i][0] = dp[i-1][2] + color[i][0];
                }
                //G
                if(dp[i-1][0] < dp[i-1][2]){
                    dp[i][1] = dp[i-1][0] + color[i][1];
                }else{
                    dp[i][1] = dp[i-1][2] + color[i][1];
                }
                //B
                if(dp[i-1][0] < dp[i-1][1]){
                    dp[i][2] = dp[i-1][0] + color[i][2];
                }else{
                    dp[i][2] = dp[i-1][1] + color[i][2];
                }
            }
        }
        int ans = dp[n-1][0];
        if(dp[n-1][1] < ans) ans = dp[n-1][1];
        if(dp[n-1][2] < ans) ans = dp[n-1][2];
        System.out.println(ans);
    }
}
