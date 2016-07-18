package BeackJunAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 4. 12..
 */
public class Q6359 {
    static boolean arr[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int n, ans;
        for (int T = 1; T <= testCase; ++T) {
            ans = 0;
            n = sc.nextInt();
            arr = new boolean[n];
            //false열려있는거 true닫혀있는거
            for (int i = 2; i <= n; i++) {
                int tmp = i;
                for (int j = i; j <= n; j+=tmp) {
                    if (arr[j - 1]) {
                        arr[j - 1] = false;
                    } else {
                        arr[j - 1] = true;
                    }
                    //dan+=n;
                }
                //System.out.println(Arrays.toString(arr));
            }
            for (int i = 0; i < n; ++i) {
                if (!arr[i]) ++ans;
            }
            System.out.println(ans);
        }
    }
}
