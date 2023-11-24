import java.io.*;

public class Main {
	 public static void main(String[] args) throws IOException {
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 bw.write("Hello World!");
		 bw.flush(); //  버퍼에 있는 모든 데이터를 출력
		 bw.close(); // Buffer writer close    
	} 
}
