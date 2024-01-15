package LYJ_11021;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer tk;
		int n = Integer.parseInt(br.readLine()); 
		
		for (int i = 0; i < n; i++) {
			tk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			int sum = a+b;
			
			bw.write("Case #"+ (i+1) + ": " + sum + "\n");
			
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	

}
