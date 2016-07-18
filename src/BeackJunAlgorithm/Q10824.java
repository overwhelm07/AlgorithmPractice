package BeackJunAlgorithm;

import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 4. 14..
 */
//1,000,000
public class Q10824 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();
        long []arr = new long[4];
        for(int i=0; i<4; ++i){
            arr[i] = sc.nextInt();
        }

        str1.append(arr[0]);
        str1.append(arr[1]);
        str2.append(arr[2]);
        str2.append(arr[3]);

        long a = Long.parseLong(str1.toString());
        long b = Long.parseLong(str2.toString());

        System.out.println(a+b);


    }
}
