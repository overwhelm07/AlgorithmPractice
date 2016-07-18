package BeackJunAlgorithm;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

/**
 * 보류...
 */
public class Q1389 {

    static ArrayList <ArrayList<Integer>>adj = new ArrayList<>();
    static ArrayList <Boolean>visited = new ArrayList<>();
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//친구 수
        int m = sc.nextInt();//친구 관계 수
        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<Integer>());
        }
        int a, b;
        ArrayList <Integer> tmp = new ArrayList<>();
        for(int i=0; i<m; i++){
            a = sc.nextInt();
            b = sc.nextInt();

            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        for(int i=0; i<adj.size(); i++){
            System.out.print(i + ": ");
            for(int j=0; j<adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
        dfsAll();
    }
    static void dfs(int here){
        System.out.println("DFS visits : " + here);
        visited.set(here, true);
        for(int i=1; i<=adj.get(here).size(); ++i){
            int there = adj.get(here).get(i-1);
            if(!visited.get(there))
                dfs(there);
        }
    }
    static void dfsAll(){
        for(int i=0; i<=adj.size(); ++i){
            visited.add(false);
        }
        for(int i=1; i<=adj.size(); ++i){
            if(!visited.get(i))
                dfs(i);
        }
    }
}
