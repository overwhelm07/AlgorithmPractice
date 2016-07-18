package KoreatechCoin.Week1;

import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 5. 25..
 */
public class Q2266 {
    public static int ans = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        sol(n, k);
        System.out.println(ans);

    }
    public static void sol(int n, int k){
        //금고가 1개이거나 2층 아래일때는 모두다 검사
        if(k==1 || n<=2){
            while(n-- != 0){
                ans++;
            }
        }else{
            ans++;
            k--;
            int under = n/2;
            int up = n-(n/2+1);
            if(under > up){
                n = under;
            }else{
                n = up;
            }
            sol(n, k);
        }
    }
}
