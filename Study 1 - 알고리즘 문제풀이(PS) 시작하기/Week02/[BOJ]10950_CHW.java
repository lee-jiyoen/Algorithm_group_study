package backjoon_10950;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<n; i++) {
			String[] inputs = br.readLine().split(" ");
			int a = Integer.parseInt(inputs[0]);
			int b = Integer.parseInt(inputs[1]);
			
			bw.write((a+b) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
