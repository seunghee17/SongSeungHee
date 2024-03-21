import java.io.*;
import java.util.*;
import java.math.*;

public class Main{

	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int result = 0;
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		Arrays.sort(arr);
		for(int i=0; i<N-2; i++) {
			for(int j = i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					temp = arr[i] + arr[j] + arr[k];
					if(temp == M) {
						result = temp;
					}
					if(temp<M && result < temp ) {
						result = temp;
					}
				}
			}
		}
		System.out.println(result);
	}
}
