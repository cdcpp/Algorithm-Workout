import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] solution(int[] sequence) {


        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < sequence.length; i++) {
            for(int j = i + 1; j < sequence.length; j++) {
                set.add(sequence[i] + sequence[j]);
            }
        }


        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
