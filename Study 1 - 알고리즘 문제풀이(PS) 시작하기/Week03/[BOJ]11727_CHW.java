package backjoon_11727;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(result(n));

	}
	
	public static int result(int n) {
		int[] dp = new int[n+1];
		dp[1] = 1;
		
		if(n>1) {
			dp[2] = 3;
		}
		
		for(int i = 3; i<=n; i++) {
			dp[i] = (dp[i-1] + 2*dp[i-2])%10007;
		}
		
		return dp[n];
	}

}
