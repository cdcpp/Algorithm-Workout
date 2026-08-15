import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[] index_list) {
      String answer = Arrays.stream(index_list)
        .mapToObj(idx -> String.valueOf(my_string.charAt(idx)))
        .collect(Collectors.joining());
        
        return answer;
    }
}