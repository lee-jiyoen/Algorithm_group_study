package week3;
//11727
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int N = Integer.parseInt(br.readLine());
		int [] a= new int[N+1];
		
		a[0]=0; a[1]=1; a[2]=3;
		for(int i=3; i<=N; i++) {
			a[i]=(a[i-2]*2+a[i-1])%10007;
		}
		System.out.println(a[N]);
		
	}

}

