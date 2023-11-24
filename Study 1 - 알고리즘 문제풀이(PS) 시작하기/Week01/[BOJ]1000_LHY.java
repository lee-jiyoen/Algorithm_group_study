import java.io.*;
import java.util.*;

public class Main {
	 public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     StringTokenizer st = new StringTokenizer(br.readLine()," "); // 공백을 기준으로 입력을 분리
		 
	     int A = Integer.parseInt(st.nextToken());
		 int B = Integer.parseInt(st.nextToken());
		 
		 System.out.print(A+B);
		 br.close();
	} 
}

