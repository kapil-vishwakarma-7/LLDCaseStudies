package dsa.dp.buysellstock;

import java.util.*;

public class HashMapToArray {
    public static void main(String[] args) {
        String word = "jafalansjkdcbacnac";
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : word.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            list.add(String.valueOf(entry.getValue()));
        }
        Collections.sort(list);

        System.out.println(map);
        System.out.println(list);
        System.out.println(String.join(",", list));
    }

}
