package DP;

import java.util.Scanner;

/**
 * 만취한 상범
 */
public class Q6359 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int T=1; T<=testCase; T++){
            int n = sc.nextInt();
            boolean[] arr = new boolean[n+1];
            int j=1;
            for(int i=2; i<=n; i++){
                j=1;
                while(!(i*j>n)){
                    if(arr[i*j]) arr[i*j] = false;
                    else arr[i*j] = true;
                    j++;
                }
            }
            int ans = 0;
            for(int i=1; i<arr.length; i++){
                if(!arr[i]) ans++;
            }
            System.out.println(ans);
        }
    }
}
