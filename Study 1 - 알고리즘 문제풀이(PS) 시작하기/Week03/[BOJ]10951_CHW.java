package backjoon_10951;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        String line;
	        while ((line = br.readLine()) != null && !line.isEmpty()) {
	            String[] parts = line.split(" ");
	            int a = Integer.parseInt(parts[0]);
	            int b = Integer.parseInt(parts[1]);
	            System.out.println(a + b);
	        }
	        br.close();
	}
}
