package TopCoderTraining;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by JeongHeon on 2016. 5. 17..
 */
public class InterestingDigits {
    public static void main(String []args){
        int base = 10;
        int ans[] = digits(base);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] digits(int base){
        ArrayList <Integer>al = new ArrayList<>();

        for(int i=2; i<base; ++i){
            boolean ok = true;
            for(int k0=0; k0<base; k0++){
                for(int k1=0; k1<base; k1++){
                    for(int k2=0; k2<base; k2++){
                        if((k2+(k1*base)+(k0*base*base))%i==0 && (k0+k1+k2)%i != 0 ){
                            ok = false;
                            break;
                        }
                    }
                    if(!ok) break;
                }
                if(!ok) break;
            }
            if(ok) al.add(i);
        }
        int[] ans = new int[al.size()];
        for(int i=0; i<al.size(); ++i) ans[i] = al.get(i);
        return ans;
    }
}
