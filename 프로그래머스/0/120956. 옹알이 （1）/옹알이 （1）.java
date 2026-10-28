class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String [] checkArr = {"aya","ye","woo","ma"};
        
        for(int i=0;i<babbling.length;i++){
            String check = babbling[i];
            for(int j=0;j<checkArr.length;j++){
                check = check.replace(checkArr[j]," ");
            }
            check = check.replace(" ", "");
            if (check.isEmpty()) {
                answer += 1;
            }
        }
        
        return answer;
    }
}