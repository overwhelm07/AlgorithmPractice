package com;

import java.util.Scanner;

//{1, 2, 3}
public class Q1027 {
    static int deepMax;
    static StringBuffer sequence = new StringBuffer();
    static boolean isFind = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        deepMax = sc.nextInt(); // 1<=n<=80

        findGoodNumber(0);
        display();
        //System.out.println(Arrays.toString(arr));
    }

    public static void findGoodNumber(int deep) {
        if (deep == deepMax) {
            isFind = true;
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (isFind) return;
            if (isGood(i, deep + 1)) {
                findGoodNumber(deep + 1);
            }
        }
        if (isFind) return;
        sequence.deleteCharAt(sequence.length() - 1);
        return;
    }

    public static boolean isGood(int target, int deep) {
        sequence.append(target);
        int length = deep;
        for(int i=length/2; i>0; i--){
            if(sequence.substring(length-i, length).equals(sequence.substring(length-2*i, length-i))){
                sequence.deleteCharAt(sequence.length()-1);
                return false;
            }
        }
        return true;
    }

    public static void display() {
        System.out.print(sequence.toString());
    }

}
