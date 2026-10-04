import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char t;
        Stack<Character> stack = new Stack<>();


        for(int i = 0; i < s.length(); i++){
            t = s.charAt(i);
            if(i == 0 && t == ')') {
                answer = false;
                return answer;
            }

            if(t == '('){
                stack.push(t);
            }else{
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    continue;
                }
            }

        } // for end

        if(stack.isEmpty()){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}