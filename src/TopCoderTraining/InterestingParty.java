package TopCoderTraining;

import com.Main;

import java.util.HashMap;

/**
 * Created by JeongHeon on 2016. 5. 17..
 */
public class InterestingParty {

    public static void main(String[] args) {
        String[] f = new String[]{"f", "g", "s", "f"};
        String[] s = new String[]{"h", "f", "f", "b"};

        int ans = bestInvitation(f, s);
        System.out.println(ans);
    }

    public static int bestInvitation(String[] first, String[] second) {
        //ver1.
        /*int max = 0;
        for (int i = 0; i < first.length; ++i) {
            int f = 0; int s = 0;
            for(int j=0; j < first.length; ++j){
                if(first[i]==first[j]) f++;
                if(first[i]==second[j]) f++;
                if(second[i] == second[j]) s++;
                if(second[i] == first[j]) s++;

                max = Math.max(max, f);
                max = Math.max(max, s);
            }
        }
        return max;*/
        //ver2. hashMap사용
        HashMap<String,Integer> dic = new HashMap<>();

        for(int i=0; i<first.length; ++i){
            dic.put(first[i], 0);
            dic.put(second[i], 0);
        }
        for(int i=0; i<first.length; ++i){
            dic.put(first[i], dic.get(first[i])+1);
            dic.put(second[i], dic.get(second[i])+1);
        }
        int ans = 0;
        for(String key : dic.keySet()){
            ans = Math.max(ans, dic.get(key));
        }
        return ans;
    }
}
