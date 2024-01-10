import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		// 테스트 케이스의 개수 T를 입력 받
		String T_input = br.readLine();
		int T = Integer.parseInt(T_input); 

		// dp 배열 선언
		int dp[] = new int[1001];
		// 초기값 선언
		dp[1] = 1;
		dp[2] = 2; 
		dp[3] = 4;

		for(int i=0; i<T; i++) {
			String n_input = br.readLine(); // 문자열로 입력 받으니까 
		    int n = Integer.parseInt(n_input); // 입력 받은 문자를 숫자로 변환해야함 
		        
			for(int j=4; j<=n; j++){
				dp[j] = dp[j-1] +dp[j-2] + dp[j-3];
			}
			bw.write(Integer.toString(dp[n])+"\n");
		}

		bw.flush();
		bw.close();
	}
}
