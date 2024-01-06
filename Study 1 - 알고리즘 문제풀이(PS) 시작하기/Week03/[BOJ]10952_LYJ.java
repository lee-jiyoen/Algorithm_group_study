import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		StringTokenizer tk;

		
		while(true) {
			tk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			
			if (a == 0 && b == 0) {
				break;
			}
			
			int sum = a+b;
			bw.write(sum + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
