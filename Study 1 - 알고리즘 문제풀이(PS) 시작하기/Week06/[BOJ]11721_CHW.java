import java.io.*;

public class Main {

	public static void main(String[] args)  throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  String w = br.readLine();
	        
	    for (int i = 0; i < w.length(); i++) {
	        System.out.print(w.charAt(i));
	            
	        if ((i + 1) % 10 == 0 || i == word.length() - 1) {
	            System.out.println();
	        }
	    }
  }
}
