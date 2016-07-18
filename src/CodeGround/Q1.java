package CodeGround;

import java.util.HashMap;
import java.util.Scanner;

class Q1 {
    static int K;
    static long min, max;
    static HashMap<Long, Boolean> hash = new HashMap<>();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int T = 1; T <= testCase; T++) {
            hash.clear();
            K = sc.nextInt();
            max = (long) Math.pow(2, K);
            min = max;
            //sol(1, 0);
            long n = 1;
            for (int i = 0; i < K; i++) {
                if (n - 1 > 3 && (n - 1) % 3 == 0) {
                    if (((n-1)/3)%2!=0){
                        n = (n-1)/3;
                    }else{
                        n = n*2;
                    }
                }else{
                    n = n*2;
                }
            }
            if(n < min) min = n;
            System.out.println("Case #" + T);
            System.out.println(min + " " + max);
        }
    }
    /*public static void sol(long val, int len){
        if(hash.get(val)==null){
            hash.put(val, true);
            if(len==K){
                if(val < min) min = val;
            }else{
                if(val-1>3 && (val-1)%3==0){
                    if(((val-1)/3)%2!=0){
                        sol((val-1)/3, len+1);
                    }
                }
                sol(val*2, len+1);
            }
        }
    }*/
}
