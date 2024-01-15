import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); 
		
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			String arr[] = input.split(" ");
			
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			
			
			bw.write("Case #"+ (i+1) + ": " + (a+b) + "\n");
			
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
