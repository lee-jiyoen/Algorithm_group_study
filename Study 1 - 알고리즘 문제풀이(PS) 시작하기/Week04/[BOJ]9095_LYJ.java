import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine()); //test case
		
		int[] dp = new int[12];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i = 0; i < t; i++) {
			
			int n = Integer.parseInt(br.readLine());
			
			for (int j = 4; j <= n; j ++) {
				dp[j] = (dp[j-1] + dp[j-2] + dp[j-3]);
			}
			
			bw.write(String.valueOf(dp[n] + "\n"));
			
		}
		

		br.close();
		
		bw.flush();
		bw.close();
	}

}
