import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String N = br.readLine(); 

		for(int i=0; i<N.length(); i++) {
			bw.write(N.charAt(i));
			if (i % 10 == 9) // 인덱스가 9번째 (10번째 알파벳이면)
				bw.write("\n"); // 줄바꿈 	
		}
		
		bw.flush();
		bw.close();
	}
}
