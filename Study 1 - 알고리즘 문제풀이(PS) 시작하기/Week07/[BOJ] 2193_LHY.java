import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String N = br.readLine(); 
		int number = Integer.parseInt(N);
		
		long dp[] = new long[number+1];
		

		dp[0] = 0;

		// 이 조건문을 추가하지 않으면 런타임에러 rayIndexOutOfBounds (배열의 크기를 초과하는 인덱스에 접근) 오류 발생
		if(number>=1)
			dp[1] = 1;
		if(number>=2)
			dp[2] = 1;
		                                                                                                                                                                                                    

		for(int i=2; i<=number; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		bw.write(Long.toString(dp[number]));

		bw.flush();
		bw.close();
	}
}
