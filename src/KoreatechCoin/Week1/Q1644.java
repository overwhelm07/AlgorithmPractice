package KoreatechCoin.Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 시간초과뜸
 */
public class Q1644 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = sol(n);
        System.out.println(ans);

    }
    public static int sol(int n){
        //짝수이면 소수합이 아니므로 리턴0
        if(n%2==0){
            return 0;
        }

        boolean ok = false;
        int cnt = 0;

        //n이하의 소수값들을 al에다 넣기
        ArrayList <Integer> al = new ArrayList<>();
        al.add(2);
        for(int i=3; i<=n; i+=2){
            ok = true;
            for(int j=0; j<al.size(); j++){
                //시간초과가 떠서
                //복잡도를 줄여보기 위해서 소수구할때 이미 구한 소수 값을 나눔을 이용해봄
                if(i%al.get(j)==0){
                    ok = false;
                    break;
                }
            }
            if(ok){
                al.add(i);
            }
        }

        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i) + " ");
        }


        //연속한 소수 합이 n인지 확인하는 알고리즘
        /*int sum = 0;
        for(int i=0; i<al.size(); i++){
            sum = 0;
            int j = i;
            while(sum < n){
                sum += al.get(j++);
            }
            if(sum == n) cnt++;
        }*/


        return cnt;
    }
}
