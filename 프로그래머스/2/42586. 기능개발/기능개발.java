import java.util.*;

class Solution {
      public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int check = 0;
        int count = 0;

        Queue<Integer> progressesQue = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++){
            int speed = speeds[i];
            int progress = progresses[i];
            int day = (100 - progress) % speed == 0 ? (100 - progress) / speed : ((100 - progress) / speed) +1;

            progressesQue.add(day);
        }

        while(!progressesQue.isEmpty()){
            if(check == 0){
                check = progressesQue.poll();
                count ++;
            }else{
                if(check >= progressesQue.peek()){
                    count++;
                    progressesQue.poll();
                }else{
                    check = progressesQue.poll();
                    list.add(count);
                    count = 0;
                    count++;
                }
            }
        }
        list.add(count);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}