import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine(); // 문자열로 입력 받으니까 
        int n = Integer.parseInt(input); // 입력 받은 문자를 숫자로 변환해야함 
        
        // 배열 선언 (1<=n<=1000)
        int dp[] = new int[1001];
        
        // 초기값 선언
        dp[1]=1;
        dp[2]=3;
        
        // dp 반복문
        for(int i=3; i<=n; i++){
            dp[i] = (2*dp[i-2] + dp[i-1])%10007;
        }
        
        bw.write(Integer.toString(dp[n])); // 출력할 땐 다시 문자열로 변환
        bw.flush();
        bw.close();
    }
}
