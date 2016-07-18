package BeackJunAlgorithm;

import java.util.*;

/**
 * Created by JeongHeon on 2016. 4. 23..
 */
public class Test {
    static HashMap<String, Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";

        while (sc.hasNext()) {
            str = sc.next().toLowerCase();
            if (str.equals("quit")) break;
            int i = 0, j = str.length() - 1;
            while (!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                i++;
            }
            while (!(str.charAt(j) >= 'a' && str.charAt(j) <= 'z')) {
                j--;
            }
            StringBuffer sb = new StringBuffer();
            sb.append(str.charAt(i));
            sb.append(str.charAt(j));
            if (!hm.containsKey(sb.toString())) {
                hm.put(sb.toString(), 1);
            } else {
                int tmp = hm.get(sb.toString());
                tmp++;
                hm.put(sb.toString(), tmp);
            }
        }

        Iterator it = sortByValue(hm).iterator();
        while(it.hasNext()){
            String tmp = (String) it.next();
            System.out.println(tmp + ", " + hm.get(tmp));
        }
    }
    public static List sortByValue(final Map map) {
        List <String> list = new ArrayList<>();
        list.addAll(map.keySet());

        Collections.sort(list, new Comparator(){
            public int compare(Object o1, Object o2){
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);

                return ((Comparable) v1).compareTo(v2);
            }
        });

        Collections.reverse(list);
        return list;

    }
}
