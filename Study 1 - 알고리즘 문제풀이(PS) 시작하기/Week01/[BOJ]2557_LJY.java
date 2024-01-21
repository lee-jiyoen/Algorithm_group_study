import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
//2557
public class Main1 {

	public static void main(String[] args) throws IOException{
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		String a= "Hello World!";
		bf.write(a);
		bf.close();
	}

}
