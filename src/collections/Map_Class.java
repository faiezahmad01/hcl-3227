package collections;
import java.util.*;

public class Map_Class {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String s = "dskdjwnqjdbhwdj";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
//            if(!map.containsKey(ch)){
//                map.put(ch,1);
//            }else{
//                map.put(ch,map.get(ch)+1);
//            }
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
