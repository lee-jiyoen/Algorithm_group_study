import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String N = br.readLine();
        int count = Integer.parseInt(N);
        
        for(int i=count; i>=1; i--){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}
