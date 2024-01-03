import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		
		while(true){
		
		String input = br.readLine();// 문자열로 입력 받으니까 
		String split[] = input.split(" ");
		
		int A = Integer.parseInt(split[0]); // 입력 받은 문자를 숫자로 변환해야함 
		int B = Integer.parseInt(split[1]);
		
		if(A+B!=0)
			bw.write(Integer.toString(A+B)+"\n");
		else
			break;
		}
		
		bw.flush();
		bw.close();
	}
}
