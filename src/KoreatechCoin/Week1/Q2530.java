package KoreatechCoin.Week1;

import java.util.Scanner;

/**
 * Created by JeongHeon on 2016. 5. 20..
 */
public class Q2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        int n = sc.nextInt();

        int tmpHour = n / 3600;
        n -= (tmpHour * 3600);
        int tmpMin = n / 60;
        n -= (tmpMin * 60);
        int tmpSec = n;
        //System.out.println(tmpHour + " " + tmpMin + " " + tmpSec);

        //sec
        if (tmpSec + sec > 59) {
            int tmp = tmpSec + sec - 60;
            min++;
            sec = tmp;
        } else {
            sec += tmpSec;
        }
        //min
        if (tmpMin + min > 59) {
            int tmp = tmpMin + min - 60;
            hour++;
            min = tmp;
        } else {
            min += tmpMin;
        }
        //hour
        if (tmpHour + hour > 23) {
            int tmp = tmpHour + hour;
            while (tmp > 23) {
                tmp -= 24;
            }
            hour = tmp;
        } else {
            hour += tmpHour;
        }

        System.out.println(hour + " " + min + " " + sec);
    }
}
