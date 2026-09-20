import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    //백준 11659번
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken()); //데이터의 개수
        int q = Integer.parseInt(st.nextToken()); //질의개수

        int[] sumArray = new int[m + 1]; // m[0] = 0으로 초기화
        st = new StringTokenizer(br.readLine()); // 배열 데이터
        for (int i = 1; i <= m; i++) {
            sumArray[i] = sumArray[i - 1] + Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(sumArray[b] - sumArray[a-1]).append("\n");

        }
        System.out.println(sb);
    }

}


