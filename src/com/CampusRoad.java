package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 4. 15..
 */
public class CampusRoad {


    public static void main(String[] arg) throws Exception {

        int n = 6;
        int m = 5000;
        int i, j, k = 0, start, end, min;
        int[] vertex = new int[6];//정점의 탐색여부
        int[] distance = new int[6];//가중치
        int[] via = new int[6];//정점의 엣지정보

        int[][] data = { { 0, 10, 30, m, m, m }, // Node 0에서의 거리.
                { 10, 0, 15, 40, m, m }, // Node 1에서의 거리.
                { 30, 15, 0, 10, 20, m }, // Node 2에서의 거리.
                { m, 40, 10, 0, 20, 30 }, // Node 3에서의 거리.
                { m, m, 20, 20, 0, 10 }, // Node 4에서의 거리.
                { m, m, m, 30, 10, 0 } // Node 5에서의 거리.
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\n출발점 : ");
        start = Integer.parseInt(br.readLine());

        System.out.print("\n도착점 : ");
        end = Integer.parseInt(br.readLine());


        for (j = 0; j < 6; j++) {
            vertex[j] = 0;
            distance[j] = m;
        }

        distance[start] = 0;

        for (i = 0; i < 6; i++) {
            min = m;
            for (j = 0; j < 6; j++) {
                if (vertex[j] == 0 && distance[j] < min) {

                    k = j;
                    min = distance[j];
                }
            }
            vertex[k] = 1;
            if (min == m)
                break;

            for (j = 0; j < 6; j++) {

                if (distance[j] > distance[k] + data[k][j]) {

                    distance[j] = distance[k] + data[k][j];
                    via[j] = k;
                }
            }


        }

        System.out.printf("\n %d에서 출발하여, %d로 가는 최단 거리는 %d입니다.\n", start, end,
                distance[end]);

        int path[] = new int[6];
        int path_cnt = 0;

        k = end;
        while (true) {
            path[path_cnt++] = k;
            if (k == start)
                break;
            k = via[k];
        }

        System.out.print(" 경로는 : ");

        for (i = path_cnt - 1; i >= 1; i--) {
            System.out.printf("%d -> ", path[i]);
        }

        System.out.printf("%d입니다", path[i]);
    }
}