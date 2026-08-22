import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();
        
          for(int i=0;i<arr.length;i++){
            int k = arr[i];
            for(int j=0;j<arr[i];j++){
                answerList.add(k);
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}