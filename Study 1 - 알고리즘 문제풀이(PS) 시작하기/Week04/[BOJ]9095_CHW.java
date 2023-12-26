package backjoon_9095;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int[] arr = new int[l];
		int[] dp = new int[11];
		for(int i =0; i<l;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 3; i<=10; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}
		
		for(int i =0; i<l; i++) {
			 System.out.println(dp[arr[i]]);
		}
	}
	
	
}
