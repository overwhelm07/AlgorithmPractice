package com;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by JeongHeon on 2016. 4. 11..
 */
public class Main {
    //back, forward
    static Stack<String> back = new Stack<>();
    static Stack<String> forward = new Stack<>();

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str="";
        String webPage = "";
        String nowPage = "";
        back.push("http://www.acm.org/");
        while(true){
            str = sc.nextLine();
            //sc.nextLine();
            if(str.length()>10){
                webPage = str.substring(6);
                //System.out.println(webPage);
                str = str.substring(0, 5);
                //System.out.println(str.length());
                //System.out.println(str);
            }
            webPage=webPage.trim();
            str=str.trim();
            if(str.equals("VISIT")){
                //System.out.println("v");
                back.push(webPage);
                forward.clear();
                nowPage = webPage;
                System.out.println(nowPage);
            }else if(str.equals("BACK")){
                //System.out.println("b");
                if(!back.isEmpty()){
                    forward.push(nowPage);
                    nowPage=back.pop();
                    if(back.size()>=1){
                        nowPage = back.peek();
                        System.out.println(nowPage);
                    }

                }else{
                    System.out.println("Ignored");
                }
            }else if(str.equals("FORWARD")){
                if(!forward.isEmpty()){
                    back.push(nowPage);
                    nowPage = forward.pop();
                    System.out.println(nowPage);
                }else{
                    System.out.println("Ignored");
                }
            }else{
                return;
            }
        }
    }
}
