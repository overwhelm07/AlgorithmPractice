package KoreatechCoin.Week1;

import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 5. 19..
 */
public class Q1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //System.out.println(n);
        int tmp = -1;
        int cnt = 0;
        while (n != tmp) {
            if (cnt == 0) {
                tmp = n;
            }
            int a = tmp/10;//10의자리
            int b = tmp%10;//1의자리
            int c = a+b;
            //System.out.println(a + " " + b + " " + c);
            tmp = b*10 + c%10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
