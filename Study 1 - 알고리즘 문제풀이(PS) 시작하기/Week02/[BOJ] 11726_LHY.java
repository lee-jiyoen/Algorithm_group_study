import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		int N = Integer.parseInt(input);
		
		int dp[] = new int[N+1]; // 입력 받은 정수를 배열에 저장
		dp[1] =1;
		if(N>1)
			dp[2] =2;
		
		for(int i=3; i<=N; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		}
		
		bw.write(Integer.toString(dp[N]));
		bw.flush();
		bw.close();
	}
}
