import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
         HashMap<String , Integer> map = new HashMap<>();
         for(String s : participant )
         {
             map.put(s, map.getOrDefault(s,0)+1);
         }

        for(String s : completion ){
             map.put(s, map.getOrDefault(s,0)-1);
         }
        
         return   map.entrySet().stream()
             .filter(e -> e.getValue() > 0)
             .map(e -> e.getKey())
             .findFirst()
             .orElse("")
             .toString();
    }
}