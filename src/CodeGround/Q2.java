package CodeGround;


import java.util.Scanner;

public class Q2 {
    static final long MOD = 1000000009;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        //1<=N<=50,000 1<=K<=100 0<=L<=N/2
        for(int T=1; T<=testCase; T++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int L = sc.nextInt();
            int[] arr;
            if(L>0){
                arr = new int[L];
                for(int i=0; i<L; i++){
                    arr[i] = sc.nextInt();
                }
            }



            System.out.println("Case #"+T);
        }
    }
}
