package backjoon_10844;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		long[][] dp = new long[l+1][10];
		for(int i =1; i<=9; i++) {
			dp[1][i] = 1;
		}
		 for (int i = 2; i <= l; i++) {
	            for (int j = 0; j <= 9; j++) {
	                if (j == 0) {
	                    dp[i][0] = dp[i-1][1] % 1_000_000_000;
	                } else if (j == 9) {
	                    dp[i][9] = dp[i-1][8] % 1_000_000_000;
	                } else {
	                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1_000_000_000;
	                }
	            }
	    }
		 
		long result = 0;
	       for (int i = 0; i <= 9; i++) {
	           result = (result + dp[l][i]) % 1_000_000_000;
	       }

	       System.out.println(result);
		  
	}
}
