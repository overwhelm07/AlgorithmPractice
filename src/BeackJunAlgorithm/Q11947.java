package BeackJunAlgorithm;

import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 4. 14..
 */
public class Q11947 {
    //static LinkedHashMap <Integer, Integer> hs = new LinkedHashMap<>();
    static long []dp = new long[150000000];
    static int n;
    public static void main(String []args){



        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        long ans=0;
        for(int T=0; T<testCase; ++T){
            n = sc.nextInt();
            ans = sol(n);
            System.out.println(ans);
        }
    }
    public static long sol(int n){
        String a="";
        StringBuffer b;
        int len;
        for(int i=1; i<=n; ++i){
            if(dp[i-1]==0){
                b = new StringBuffer();
                a = String.valueOf(i);
                len = a.length();
                for(int x=0; x<len; x++){
                    if(9-a.charAt(x)!=0){
                        b.append(9-(a.charAt(x)-48));
                    }
                }
                long tmp = Integer.parseInt(b.toString());

                dp[i-1] = tmp * i;
            }
        }
        long max=0;
        for(int i=0; i<n; ++i){
            if(dp[i] > max) max = dp[i];
        }
        return max;
    }
}
