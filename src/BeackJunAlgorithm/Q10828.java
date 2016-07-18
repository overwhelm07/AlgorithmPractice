package BeackJunAlgorithm;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by JeongHeon on 2016. 4. 14..
 */
public class Q10828 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Stack <Integer> stack = new Stack<>();
        int n = sc.nextInt();
        sc.nextLine();
        String command="";
        for(int i=0; i<n; ++i){
            command = sc.nextLine();
            if(command.length()>=6){
                stack.push(Integer.parseInt(command.substring(5)));
            }else if(command.length()==5){
                if(stack.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else if(command.length()==4){
                System.out.println(stack.size());
            }else if(command.length()==3 && command.equals("pop")){
                if(!stack.isEmpty()){
                    System.out.println(stack.pop());
                }else{
                    System.out.println("-1");
                }
            }else{
                if(!stack.isEmpty()){
                    System.out.println(stack.peek());
                }else{
                    System.out.println("-1");
                }

            }
        }

    }
}
