package week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

//11726

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int N = Integer.parseInt(br.readLine());
		int [] a= new int[N+1];
		
		a[0]=1; a[1]=1;
		for(int i=2; i<=N; i++) {
			a[i]=(a[i-1]+a[i-2])%10007;
		}
		System.out.println(a[N]);
		
	}

}
