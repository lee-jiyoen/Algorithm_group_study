import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int[][] dp = new int[l+1][10];
		for(int i =0; i<=9; i++) {
			dp[1][i] = 1;
		}
		for (int i = 2; i <= l; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= j; k++) {
                    dp[i][j] = (dp[i][j] + dp[i-1][k]) % 10007;
                }
            }
        }
		int result = 0;
        for (int i = 0; i <= 9; i++) {
            result = (result + dp[l][i]) % 10007;
        }

        System.out.println(result);
		
	}

}
