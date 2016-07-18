package chapter.six;

import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 4. 11..
 */
public class Picnic {

    static int friends[];
    static boolean areFriends[][];
    static int testCase, studentNum, friendNum;//2<=studentNum<=10

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans;
        boolean []taken = new boolean[10];


        testCase = sc.nextInt();

        for (int T = 1; T <= testCase; T++) {
            ans = 0;
            studentNum = sc.nextInt();
            friendNum = sc.nextInt();
            friends = new int[friendNum * 2];
            areFriends = new boolean[10][10];
            for (int i = 0; i < friends.length; i++) {
                friends[i] = sc.nextInt();
            }
            for (int i = 0; i < friends.length; i += 2) {
                areFriends[friends[i]][friends[i + 1]] = true;
                areFriends[friends[i + 1]][friends[i]] = true;
            }
            /*for(int i=0; i<10;i++){
                for(int j=0; j<10; j++){
                    System.out.print(areFriends[i][j] + ", ");
                }
                System.out.println();
            }*/
            ans = sol(taken);
            System.out.println(ans);
        }
    }

    public static int sol(boolean taken[]) {
        int firstFree = -1;
        for(int i=0; i<studentNum; ++i){
            if(!taken[i]){
                firstFree = i;
                break;
            }
        }
        if(firstFree==-1) return 1;
        int ret = 0;
        for(int pairWith = firstFree+1; pairWith<studentNum; ++pairWith){
            if(!taken[pairWith] && areFriends[firstFree][pairWith]){
                taken[firstFree] = taken[pairWith] = true;
                ret += sol(taken);
                taken[firstFree] = taken[pairWith] = false;
            }
        }
        return ret;
    }
}
