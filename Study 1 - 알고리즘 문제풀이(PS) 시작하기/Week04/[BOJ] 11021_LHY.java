import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		// 테스트 케이스의 개수 T를 입력 받
		String T_input = br.readLine();
		int T = Integer.parseInt(T_input); 

		for(int i=1; i<=T; i++) {
			String input = br.readLine(); // 문자열로 입력 받으니까 
		    String arr[] = input.split(" ");
		    
		    int A = Integer.parseInt(arr[0]);
		    int B = Integer.parseInt(arr[1]);
		    
			bw.write("Case #"+Integer.toString(i)+": " + Integer.toString(A+B) + "\n");
		}

		bw.flush();
		bw.close();
	}
}
