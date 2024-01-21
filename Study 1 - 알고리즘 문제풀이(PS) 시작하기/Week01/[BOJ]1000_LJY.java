import java.io.*;


public class Main3 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s=br.readLine();
        int A=Integer.parseInt(s.split(" ")[0]);
        int B=Integer.parseInt(s.split(" ")[1]);
            
        System.out.println(A+B);
        br.close();
        

	}

}
