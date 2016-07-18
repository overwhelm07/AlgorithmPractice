package BeackJunAlgorithm;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 4. 22..
 */
public class NQueen {
    static int n, count = 0;
    static int []a;
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = new int[n];
        nqueen(-1);
        System.out.println(count);
    }
    static void nqueen(int cur){
        System.out.println(Arrays.toString(a));
        //현재위치가 끝까지 간 경우 카운트 증가
        if(cur == n-1){
            count++;
            return;
        }
        //아직 끝에 도달하지 않았으면 다음 위치를 찾는다
        for(int i=0; i<n; i++){
            a[cur+1] = i;
            if(check(cur+1)){
                nqueen(cur+1);
            }
        }
    }
    static boolean check(int cur){
        for(int i=0; i<cur; i++){
            //열이나 대각선에 말이 있으면 그 위치에 두면안됨
            if(a[i]==a[cur] || Math.abs(cur-i)==Math.abs(a[cur]-a[i])){
                return false;
            }
        }
        return true;
    }
}
