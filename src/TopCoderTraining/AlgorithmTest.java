package TopCoderTraining;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JeongHeon on 2016. 5. 17..
 */
public class AlgorithmTest {
    public static void main(String []args){
        Map<String, Integer> hm = new HashMap<String, Integer>();
        int arr[] = new int[10];
        String tmp[] = new String[]{"a", "b", "c"};
        for(int i=0; i< tmp.length; i++){
            if(!hm.containsKey(tmp[i])) hm.put(tmp[i], 0);
            hm.put(tmp[i], hm.get(tmp[i]) + 1);
        }
        for(String key : hm.keySet()){
            System.out.println(key + " " + hm.get(key));
        }


    }
}
