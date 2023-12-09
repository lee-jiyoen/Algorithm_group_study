import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;	
		String str;
		String result = "";

		while((str = br.readLine()) != null) {
		    st = new StringTokenizer(str, " ");

		    int A = Integer.parseInt(st.nextToken());
		    int B = Integer.parseInt(st.nextToken());

		    result += (A + B + "\n");
		}

		bw.write(result);

		bw.flush();
		bw.close();
	}
}
