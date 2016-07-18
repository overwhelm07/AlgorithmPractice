package KoreatechCoin.Week1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by JeongHeon on 2016. 5. 19..
 */
public class Q1874 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack <Integer> stack = new Stack<>();
        ArrayList<String> al = new ArrayList<>();
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean isOk = true;
        int i=1, j=0;
        while(i<=n){
            if(!(stack.isEmpty()) && stack.peek()==arr[j]){
                stack.pop();
                al.add("-");
                j++;
            }else{
                stack.push(i++);
                al.add("+");
            }
        }
        while(!stack.isEmpty() && arr[j++]==stack.pop()){
            al.add("-");
        }
        if(j!=n){
            System.out.println("NO");
        }else{
            for(int z=0; z<al.size(); z++){
                System.out.println(al.get(z));
            }
        }
    }
}
