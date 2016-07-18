package chapter.six;

import java.util.Arrays;
import java.util.Scanner;

public class BoardCover {
    static int board[][];
    static int testCase, h,w;// 1<=h,w<=20
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tmpString;
        int ans;
        testCase = sc.nextInt();
        for(int T=1; T<=testCase; ++T){
            h = sc.nextInt();
            w = sc.nextInt();
            sc.nextLine();
            board = new int[h][w];
            for(int i=0; i<h; ++i){
                tmpString = sc.nextLine();
                //System.out.println(tmpString);
                for(int j=0; j<tmpString.length(); ++j){
                    if(tmpString.charAt(j) == '#') board[i][j]=1;
                    else board[i][j]=0;
                }
            }
            ans = sol();
            System.out.println(ans);
            //showBoard();
        }
    }

    static final int [][][]coverType= new int[][][]{
        {{0, 0}, {1, 0}, {0, 1}},//b
        {{0, 0}, {0, 1}, {1, 1}},//c
        {{0, 0}, {1, 0}, {1, 1}},//d
        {{0, 0}, {1, 0}, {1, -1}}//e
    };
    //delta = 1 덮고 -1이면 덮었던 블록을 없앤다
    public static boolean set(int y, int x, int type, int delta){
        boolean ok = true;
        for(int i=0; i<3; ++i){
            int ny = y + coverType[type][i][0];
            int nx = x + coverType[type][i][1];
            if(ny < 0 || ny >= board.length || nx <0 || nx >= board.length) ok = false;
            else if((board[ny][nx] += delta) > 1) ok = false;
        }
        return ok;
    }
    //board 1: 덮인 칸 board 0: 안 덮인 칸
    public static int sol(){
        int y=-1, x=-1;
        //아직 채우지 못한 칸 중 가장 윗줄 왼쪽에 있는 칸을 찾는다
        for(int i=0; i<board.length; ++i){
            for(int j=0; j<board[i].length; ++j){
                if(board[i][j] == 0){
                    y = i; x = j; break;
                }
            }
            if(y!=-1) break;
        }
        //기저 사례: 모든 칸을 채웠으면 1을 반환한다
        if(y == -1) return 1;
        int ret = 0;
        for(int type=0; type<4; ++type){
            if(set(y, x, type, 1))
                ret += sol();
            set(y, x, type, -1);
        }
        return ret;
    }
    public static void showBoard(){
        for(int i=0; i<h; ++i){
            for(int j=0; j<w; ++j){
                System.out.printf("%3d", board[i][j]);
            }
            System.out.println();
        }
    }
}
