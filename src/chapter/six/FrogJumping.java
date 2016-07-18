package chapter.six;

import java.util.Scanner;
import java.io.FileInputStream;

class FrogJumping {
    static int jumpAblility;//1<=jump<=10^9;
    public static void main(String args[]) throws Exception	{
        Scanner sc = new Scanner(System.in);

        int TC;
        int test_case, ans = 0;
        int num;//돌들의 개수 1<=N<=1,000,000
        int []arr;//돌들의 좌표

        TC = sc.nextInt();
        for(test_case = 1; test_case <= TC; test_case++) {
            // 이 부분에서 알고리즘 프로그램을 작성하십시오.
            num = sc.nextInt();
            arr = new int[num];
            for(int i=0; i<num; i++){
                arr[i] = sc.nextInt();
            }
            jumpAblility = sc.nextInt();


            ans = sol(arr);
            // 이 부분에서 정답을 출력하십시오.
            System.out.println("Case #" + test_case);
            System.out.println(ans);

        }
        sc.close();
    }
    public static int sol(int []arr){
        int num = arr.length, ans = 0;
        boolean chk2 = true, chk1 = true, chk3 = false;


        int  currentIdx=0, i=0;
        while(chk1){
            for(; i<num&&chk2; ){
                if(i==arr.length) return -1;
                if(currentIdx+jumpAblility >= arr[i]){
                    if(i==arr.length-1){
                        ans++;
                        i++;
                        chk2 = false;
                        chk1 = false;
                        continue;
                    }
                    chk3=true;
                    i++;
                }else if(currentIdx+jumpAblility < arr[i]){
                    if(chk3){
                        ans++;
                        chk2 = false;
                        chk3 = false;
                    }else{
                        return -1;
                    }
                }

            }
            //System.out.println(arr[i-1]);

            currentIdx=arr[i-1];
            chk2 = true;
        }




        return ans;
    }
}