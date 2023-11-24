import java.io.*;

public class Main {

	 public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int x = Integer.parseInt(br.readLine()); 
		 int dp[] = new int[x+1]; // 입력 받은 정수를 배열에 저장 
		 dp[0] = dp[1] = 0; // 3) 초기값 정의 (0과 1을 1로 만들 수 없음)
		 
		 for(int i=2; i<=x; i++) {
			 dp[i] = dp[i-1] +1;
			 if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
			 if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1);
		 }
	     System.out.println(dp[x]);
	}
}
