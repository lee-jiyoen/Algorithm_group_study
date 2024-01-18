import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine(); 
		int N =  Integer.parseInt(input);
		
		int dp[][] = new int[1001][10];
		
		// 초기값 설정 
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }
        
        // 점화식 
        for (int i = 2; i <= N; i++) {  // 길이 
            for (int j = 0; j < 10; j++) {  // 현재 자리의 숫자 결정 
                for (int k = j; k < 10; k++) {  // 이전 자리의 숫자 결
                    dp[i][j] += dp[i - 1][k];
                    dp[i][j] %= 10007;
                }
            }
        }

		int sum = 0;
	    for (int j = 0; j < 10; j++) {
	        sum += dp[N][j];
	        sum %= 10007;
	    }
	

	    bw.write(String.valueOf(sum));

		bw.flush();
		bw.close();
	}
}
