import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	public int count(int N, int[] arr, int X) {
		int result = 0;
		int sum = 0;
		int head = 0; 
		int retail = N-1;
		
		Arrays.sort(arr);
		while(head < retail) {
			sum = arr[retail] + arr[head];
			if(sum == X) result++;
			if(sum < X) {
				head++;
			}else {
				retail--;
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) throws IOException{
		Main num = new Main();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(num.count(N,arr,x));
	}
}