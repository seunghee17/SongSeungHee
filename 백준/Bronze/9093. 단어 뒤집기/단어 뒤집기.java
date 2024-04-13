import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.math.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
			String[] arr = br.readLine().split(" ");
			for(int i=0; i<arr.length; i++) {
				StringBuilder sb = new StringBuilder(arr[i]);
				System.out.print(sb.reverse() + " ");
			}
			System.out.println();
		}	
		
	}
}
