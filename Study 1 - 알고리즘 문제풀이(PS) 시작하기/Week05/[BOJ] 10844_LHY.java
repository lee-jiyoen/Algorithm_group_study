import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		int n = Integer.parseInt(input); 
		long dp[][] = new long[101][11]; // dp[][] = [길이][마지막 숫자]
		
		// 초기값 설정 
		for(int i=1; i<=9; i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				if (j == 0) 
					dp[i][0] = dp[i-1][1] % 1000000000; // j+1
	            else if (j == 9) 
	                dp[i][9] = dp[i-1][8] % 1000000000; // j-1
	             else 
	                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
			}
		}
		
		long sum =0;
		for (int i=0; i<10; i++) {
			sum += dp[n][i];
		}

		bw.write(Long.toString(sum%1000000000));
		bw.flush();
		bw.close();
	}
}
