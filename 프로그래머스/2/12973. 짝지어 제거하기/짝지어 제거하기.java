import java.util.*;

class Solution
{
    public int solution(String s)
    {
        char t;
        Stack<Character> stack = new Stack<>();

        int answer = 0;


        for(int i = 0; i < s.length(); i++) {
            t = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(t);
                continue;
            } else {
                if (t == stack.peek()) {
                    stack.pop();
                   // stack.push(t);
                }else{
                    stack.push(t);
                }
            }
        } //for end
        
        if(stack.isEmpty()){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}