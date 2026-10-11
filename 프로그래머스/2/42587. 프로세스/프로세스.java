import java.util.*;

class Solution {
     public int solution(int[] arr, int location) {


        int check = arr[location];
        int count = 0;

        Queue<int[]> progressesQue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

           progressesQue.add(new int[]{i, arr[i]});
        }

        while (!progressesQue.isEmpty()) {

            int[] a = progressesQue.poll();
            boolean flag = false; // a 최고값 여부

            for (int[] num : progressesQue) {
                if (num[1] > a[1]) {
                    flag = true;
                    break;
                }
            }// for end

            if (flag) {
                progressesQue.add(a);
            } else {
                count++;
                if (a[0] == location) {
                    return count;
                }
            }

        }
        return count;
    }
}