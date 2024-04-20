import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	static int result = 0;
 	public static void main(String[] args) throws IOException{
 		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 		int N = Integer.parseInt(br.readLine());
 		int[] arr1 = new int[N];
 		
 		StringTokenizer st = new StringTokenizer(br.readLine());
 		for(int i=0; i<N; i++) {
 			arr1[i] = Integer.parseInt(st.nextToken());
 		}
 		int M = Integer.parseInt(br.readLine());
 		int[] arr2 = new int[M];
 		
 		StringTokenizer sr = new StringTokenizer(br.readLine());
 		for(int i=0; i<M; i++) {
 			arr2[i] = Integer.parseInt(sr.nextToken());
 		}
 		Arrays.sort(arr1);
 		for(int i=0; i<M; i++) {
 			int num = func(arr1, arr2[i]);
 			if(num<0) {
 				System.out.println("0");
 			} else {
 				System.out.println("1");
 			}
 		}
 		
	}	
 	
 	static int func(int[] arr, int key) {
 		int min=0;
 		int max = arr.length-1;
 		
 		while(min<=max) {
 			int mid = (min+max)/2;
 			if(key < arr[mid]) {
 				max = mid-1;
 			} else if(key == arr[mid]) {
 				return mid;
 			} else {
 				min = mid+1;
 			}
 		}
 		return -1;
 	}
 	
 		
 	
}