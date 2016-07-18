package DFS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 4. 14..
 */
public class Q11403 {
    static int n;
    static int[][] arr;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n][n];
        visited = new boolean[n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
        dfsAll();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void dfs(int here) {
        //System.out.println("DFS visits: " + here);
        visited[here] = true;
        for (int i = 0; i < arr[here].length; ++i) {
            if(arr[here][i]==1){
                arr[idx][i]=1;
                if(!visited[i])
                  dfs(i);
            }

        }
    }
    static int idx;
    public static void dfsAll() {
        for (idx = 0; idx < n; ++idx) {
            for(int i=0; i<visited.length; i++){
                visited[i] = false;
            }
            dfs(idx);
        }
    }
}
