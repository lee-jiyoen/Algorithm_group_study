package week3;
//10952
import java.io.*;

public class Main3 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = 0;
        int B = 0;
        StringBuilder sb = new StringBuilder();
        
        while(true){
        	String s=br.readLine();
        	
        	if(s==null || s.isEmpty()) {
        		break;
        	}
        	A=Integer.parseInt(s.split(" ")[0]);
        	B=Integer.parseInt(s.split(" ")[1]);
            
        	sb.append(A+B).append('\n');
            
        }
        System.out.println(sb);
        br.close();
        

	}

}
