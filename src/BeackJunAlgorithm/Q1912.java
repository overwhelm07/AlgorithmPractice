package BeackJunAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 4. 13..
 */
public class Q1912 {
    static int arr[];
    static int dp[];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        arr = new int[n];
        dp = new int[n];

        for(int i=0; i<n; ++i){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; ++i){
            sum+=arr[i];
            if(sum > 0){
                dp[i] = sum;
            }else{
                dp[i] = arr[i];
                sum = 0;
            }
        }
        //System.out.println(Arrays.toString(dp));
        int max = dp[0];
        for(int i=1; i<dp.length; ++i){
            if(max < dp[i]) max = dp[i];
        }
        System.out.println(max);

    }
}
