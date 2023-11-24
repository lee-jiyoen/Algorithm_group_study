import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(br.readLine());
        int dp[] = new int[x+1]; // 입력 받은 정수를 배열에 저장
        dp[0] = dp[1] = 0; // 초기값 정의 (더이상 연산이 필요 없는 값=0 : 0은 1을 만들 수 없고, 1은 이미 1)
        
        for(int i=2; i<=x; i++){
            dp[i] = dp[i-1] + 1;
            if(i%2==0) 
                dp[i] = Math.min(dp[i], dp[i/2]+1);
            if(i%3==0)
                dp[i] = Math.min(dp[i], dp[i/3]+1);
        }
	    
        bw.write(Integer.toString(dp[x])); // 문자열을 정수로 변환하여 결과값 출력
	bw.flush(); //  버퍼에 있는 모든 데이터를 출력
	bw.close(); // Buffer writer close    
    }
}
