package chapter.six;

import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 4. 9..
 */
public class EasyCalling {

    static int ans = 0, len;
    static boolean[][] arr = new boolean[4][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;

        T = sc.nextInt();

        arr[3][0] = true;
        arr[3][1] = true;
        for (int testCase = 1; testCase <= T; testCase++) {
            ans = 0;
            len = sc.nextInt();
            sol();
            System.out.println(ans);
        }
    }
    static int tmpLen;
    public static void sol() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 3 && j == 0) || (i == 3 && j == 2)) continue;
                //System.out.println(i + " "+ j);
                tmpLen=1;
                x=i;y=j;
                go(i, j);
                System.out.println("end");
            }
        }
    }
    static int x, y;
    static boolean chk1=true, chk2=true, chk3=true, chk4=true;
    public static void go(int i, int j) {
        if(len==tmpLen) ans++;
        if(availGo(i-1, j) && chk1){//chk1
            System.out.println(i-1 + " " +j);
            tmpLen++;
            go(i-1, j);
        }else{

            go(x, y);
        }
        if(availGo(i+1, j)){
            System.out.println(i+1 + " " +j);
            tmpLen++;
            go(i+1, j);
        }
        //if(len==tmpLen) ans++;
        if(availGo(i, j-1)){
            System.out.println(i + " " + (j-1));
            tmpLen++;
            go(i, j-1);
        }
        //if(len==tmpLen) ans++;
        if(availGo(i, j+1)){
            System.out.println(i + " " +j+1);
            tmpLen++;
            go(i, j+1);
        }

    }

    public static boolean availGo(int x, int y) {
        return x < 4 && x >= 0 && y >= 0 && y < 3 && !arr[x][y] && tmpLen < len;
    }
}
