import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			T--;
			int tc = sc.nextInt();
			int result = 0;
			Integer arr[] = new Integer[20];
			for(int i =0; i<20; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=0; i<20; i++) {
				for(int j = i-1; j>=0; j--) {
					if(arr[j] > arr[i]) {
						result++;
					}
				}
			
			}
			System.out.println(tc + " " + result);
		}
	}
}

