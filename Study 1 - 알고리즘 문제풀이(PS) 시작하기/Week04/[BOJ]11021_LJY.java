package week4;
//11021
import java.io.*;
import java.util.StringTokenizer;

public class Main1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i =0; i<T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append("Case #");
			sb.append(i+1);
			sb.append(": ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append("\n");
		}
		br.close();
		
		
		System.out.println(sb);
	}

}

