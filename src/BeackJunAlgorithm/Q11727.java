package BeackJunAlgorithm;

import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 4. 12..
 */
public class Q11727 {
    static final int MOD = 10007;
    static int[] cache = new int[1001];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int ans = tiling(n);
        System.out.println(ans);
    }

    public static int tiling(int width) {
        if (width <= 1) return 1;


        if (cache[width] != 0) return cache[width];
        cache[width] = (tiling(width-2) + tiling(width-1) + tiling(width-2)) % MOD;
        return cache[width];
    }
}
