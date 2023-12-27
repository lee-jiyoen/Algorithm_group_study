import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());

        for (int i = 0; i < l; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine(), ",");
            int num1 = Integer.parseInt(str.nextToken());
            int num2 = Integer.parseInt(str.nextToken());
            System.out.println(num1 + num2);
        }
    }
}
