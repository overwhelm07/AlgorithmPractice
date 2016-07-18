package KoreatechCoin.Week1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 5. 20..
 */
public class Q1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ans = new int[n];
        ArrayList<Integer> al = new ArrayList<>();
        if(m==1){
            for (int i = 1; i <= n; i++) {
                ans[i-1] = i;
            }
        }else{
            for (int i = 1; i <= n; i++) {
                al.add(i);
            }

            int idx = 0, cnt = 0, i = 0;
            while (!al.isEmpty()) {
                if (cnt+1 >= m) {
                    ans[i++] = al.get(idx);
                    al.remove(idx);
                    cnt = 0;
                }
                if (idx == al.size()) {
                    idx = 0;
                } else {
                    idx++;
                    cnt++;
                }

                if (idx >= al.size()) {
                    idx = 0;
                }

            }
        }


        //System.out.println(Arrays.toString(ans));
        System.out.print("<");
        for(int z=0; z<ans.length; z++){
            if(z==ans.length-1){
                System.out.print(ans[z]);
            }else{
                System.out.print(ans[z]+", ");
            }
        }
        System.out.print(">");

    }
}
