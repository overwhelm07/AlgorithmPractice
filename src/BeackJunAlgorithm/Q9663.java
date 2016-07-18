package BeackJunAlgorithm;

import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 4. 13..
 */
//1<=n<=15
public class Q9663 {
    static int n;
    static int ans=0;
    static int col[] = new int[255];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        queen(n);
        System.out.println(ans);
        //System.out.println(operation(4, 1));
    }
    public static void queen(int i){
        int j;
        if(promising(i)){
            if(i == n) ans++;
            else{
                for(j=1; j<=n; j++){
                    col[i+1] = j;
                    queen(i+1);
                }
            }
        }
    }
    public static boolean promising(int i){
        int k=1;
        boolean promising = true;
        while(k<i && promising){
            if(col[i] == col[k] || Math.abs(col[i]-col[k]) == Math.abs(i-k))
                promising = false;
            k++;
        }
        return promising;
    }


}
