package BeackJunAlgorithm;

import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 7. 18..
 * 2차원 배열의 합
 */
public class Q2167 {
    static int N, M, K;
    static int[] ans;
    static int[][] loc;
    static int[][] arr;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        input();
        process();
        output();
    }

    public static void input() {
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        K = sc.nextInt();
        ans = new int[K];
        for (int i = 0; i < K; i++) ans[i] = 0;
        loc = new int[K][4];
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < 4; j++) {
                loc[i][j] = sc.nextInt();
            }
        }
    }

    //loc[][] i, j, x, y
    public static void process() {
        int xs, xe, ys, ye;//
        for (int i = 0; i < K; i++) {
            xe = loc[i][2];
            ye = loc[i][3];
            for (xs = loc[i][0]; xs <= xe; xs++) {
                for (ys = loc[i][1]; ys <= ye; ys++) {
                    ans[i] += arr[xs-1][ys-1];
                }
            }
        }
    }

    public static void output() {
        for (int i = 0; i < K; i++) {
            System.out.println(ans[i]);
        }
    }
}
