package TopCoderTraining;

/**
 * 이 문제는 제일 작은 값에다 1을 더해주면 곱이 최대가 된다는 원리만 알면 쉽게 접근해서 풀 수 있다
 */
public class Cryptography {
    public static void main(String []args){
        int[] numbers = new int[]{1, 1, 1, 1};

        long ans = encrypt(numbers);
        System.out.println(ans);
    }
    public static long encrypt(int[] numbers){
        long max = 0;
        for(int i=0; i<numbers.length; ++i){
            numbers[i]++;
            int tmp = 1;
            for(int j=0; j<numbers.length; ++j){
                tmp *= numbers[j];
            }
            max = Math.max(max, tmp);
            numbers[i]--;
        }
        return max;
    }
}
