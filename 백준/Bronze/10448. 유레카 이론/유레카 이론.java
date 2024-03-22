import java.io.*;
import java.util.*;
import java.math.*;

public class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int k = Integer.parseInt(br.readLine());
			int result = eureka(k);
			System.out.println(result);
		}
	
		
	}
	
	public static int eureka(int K) {
		int[] arr = new int[45];
		for(int i=1; i<45; i++) {
			arr[i] = i*(i+1)/2;
		}
		
		for(int i=1; i<45; i++) {
			for(int j=1; j<45; j++) {
				for(int k=1; k<45; k++) {
					int temp = arr[i] + arr[j] + arr[k];
					if(temp == K) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
}