import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int [][]dp = new int [101][10];
		
		for (int i = 1; i < 10; i++) {
			dp[1][i] = 1;
		}
		
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) {
					dp[i][j] = dp[i-1][1];
				}
				else if (j == 9) {
					dp[i][j] = dp[i-1][8];
				}
				else {
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];
				}
				
				dp[i][j] %= 1000000000;
			}
		}
		
		long ans = 0;
		
		for (int k = 0; k < 10; k++) {
			ans += dp[n][k];
		}
		
		ans %= 1000000000;
		
		br.close();
		
		bw.write(String.valueOf(ans));
		
		bw.flush();
		bw.close();
		
		
	}

}
