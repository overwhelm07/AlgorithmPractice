package BeackJunAlgorithm;

import java.util.Scanner;

/*
3 100
최고속도 연료양 연료소비
 */
public class Q9501 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int T=1; T<=testCase; T++){
            int ans = 0;
            int n=sc.nextInt();
            int d=sc.nextInt();
            double ufo[][] = new double[n][3];
            for(int i=0; i<n; i++){
                ufo[i][0] = sc.nextInt();
                ufo[i][1] = sc.nextInt();
                ufo[i][2] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                //System.out.println((ufo[i][1]/ufo[i][2]));
                double result = (ufo[i][0] * (ufo[i][1]/ufo[i][2]));
                //System.out.println(result);
                if(d<=result) ans++;
            }
            System.out.println(ans);

        }
    }
}
