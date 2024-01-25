import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		long[][] dp = new long[n+1][10];
		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}
		
		
		for (int i = 2; i <= n; i ++) {//길이만큼
			for(int j = 0; j < 10; j++) { //마지막 자리 수
				for (int k = 0; k <= j; k++) { //(i-1)의 0 ~ 마지막 자리 수의 합
					dp[i][j] += dp[i-1][k];
				}
				dp[i][j] %= 10007;
			}
		}
		long ans = 0;
		
		for (int i = 0; i < 10; i++) {
			ans += dp[n][i];
		}
		
		bw.write(String.valueOf(ans % 10007));
		
		bw.flush();
		bw.close();                                                                                     
	}
}
