import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		long[] dp = new long[l+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i<=l;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		System.out.println(dp[l]);
	}

}
