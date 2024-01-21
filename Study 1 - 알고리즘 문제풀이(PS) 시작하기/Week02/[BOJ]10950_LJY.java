package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//10950
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());

        int A = 0;
        int B = 0;
        StringTokenizer st;
        String total = "";
     
        for (int i = 0 , n = T; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            
            total = Integer.toString(A+B);
            bw.write(total);
            bw.write("\n");
        }
        
 
        br.close();
        bw.close();
	}

}
