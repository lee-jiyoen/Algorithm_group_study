import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String N = br.readLine(); 
		int number = Integer.parseInt(N);
		
		for(int i=1; i<=9; i++) {
			bw.write(number + " * " + i + " = " + number*i+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
