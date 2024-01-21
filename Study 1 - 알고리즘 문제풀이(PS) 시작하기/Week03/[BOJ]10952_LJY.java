package week3;
//10952
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class Main1 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = 0;
        int B = 0;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
     
        while(true){
            st = new StringTokenizer(br.readLine());
            
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            
            if(A==0&&B==0){
            	break;
            }
            
            sb.append(A+B).append('\n');
            
        }
        System.out.println(sb);
        br.close();
	}

}
