package com;

import java.util.Scanner;

public class DeleteBlock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for(int i = 0; i < test; i++){
            int k = sc.nextInt();
            int tower[] = new int[k];

            for(int j = 0; j < k; j++){
                if(j==0 || j==k-1){
                    tower[j] = sc.nextInt();
                    if(tower[j] > 0)
                        tower[j] = 1;
                }
                else
                    tower[j] = sc.nextInt();
            }

            for(int j = 1; j < k; j++){
                tower[j] = Math.min(tower[j-1]+1,tower[j]);
            }
            for(int j = k-2; j>=0; j--){
                tower[j] = Math.min(tower[j+1]+1,tower[j]);
            }

            int sol = 0;
            for(int j = 0; j<k; j++)
                sol = Math.max(sol,tower[j]);

            int test_case = i+1;
            System.out.println("Case #" + test_case);
            System.out.println(sol);
        }

    }
}