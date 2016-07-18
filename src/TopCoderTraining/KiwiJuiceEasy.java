package TopCoderTraining;

import java.util.Arrays;

/**
 * 좀 더 효율적인 알고리즘을 구현하기 위해서는 효율적인 알고리즘을 생각하여 조건문을 줄여보자
 * 그 것은 옮길 주스의 양과 기존 주스 병의 남은 용량 중에 가장 작은 것이 이동량이 된다
 * 그래서 기존 주스 + 이동량, 옮길 주수 - 이동량으로 하면 더 효율적인 알고리즘 구현이 가능하다
 *
 *
 * 정리
 * 문제를 이해했다면 손으로 계해보자
 * 코딩이 오래 걸린다면 다시 한 번 손으로 생각해보자
 * 조건문을 되도록 조금 사용하자
*/
public class KiwiJuiceEasy {

    public static void main(String []args){
        int capacities[] = new int[]{20, 20};
        int bottles[] = new int[]{5, 8};
        int fromId[] = new int[]{0};
        int toId[] = new int[]{1};

        int ans [] = thePouring(capacities, bottles, fromId, toId);

        System.out.println(Arrays.toString(ans));


    }
    public static int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId){
        int from, to, tmp;
        for(int i=0; i<fromId.length; ++i){
            from = fromId[i]; to = toId[i];

            //기존 생각없이 짠 코드
            /*if(bottles[from] <= (capacities[to] - bottles[to])){
                bottles[to] += bottles[from];
                bottles[from] = 0;
            }else{
                tmp = capacities[to] - bottles[to];
                bottles[to] += tmp;
                bottles[from] -= tmp;
            }*/
            //좀 더 효율적으로 구현한 코드
            int vol = Math.min(bottles[from], capacities[to]-bottles[to]);//이동량을 계산
            bottles[to] += vol;
            bottles[from] -= vol;
        }
        return bottles;
    }
}
