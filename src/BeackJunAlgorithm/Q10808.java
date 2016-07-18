package BeackJunAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 4. 13..
 */
public class Q10808 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int []arr = new int[26];
        String str = sc.next();

        int tmp=0;
        for(int i=0; i<str.length(); ++i){
            tmp = str.charAt(i)-97;
            //System.out.println(tmp);
            arr[tmp]++;
        }
        for(int i=0; i<arr.length; ++i){
            System.out.print(arr[i]);
            if(i!=arr.length-1) System.out.print(" ");
            else System.out.println();
        }
        //System.out.println(Arrays.toString(arr));
    }
}
