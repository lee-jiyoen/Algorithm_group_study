import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        // 입력받은 데이터를 라인별로 읽고, 그대로 출력
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
	}

}
