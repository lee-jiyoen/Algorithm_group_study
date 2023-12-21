package backjoon_11726;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(Result(n));
	}
	
	public static int Result(int n) {
       int[] dp = new int[n+1];
       dp[1] = 1;
       if (n > 1) {
           dp[2] = 2;
       }
       for(int i =3; i<=n; i++)
       {
    	   dp[i] = (dp[i-1] + dp[i-2])%10007;
       }
       return dp[n];
    }
}
