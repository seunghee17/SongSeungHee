import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	public static String function1(int h, int w, int n){
		int [][] arr = new int[h][w];
		int a=0;
		int b=0;
		int count =0;
		for(int i=0; i<w; i++) {
			for(int j=0; j<h; j++) {
				count++;
				if(count == n) {
					a = j+1;
					b = i+1;
				}
			}
		}
		String format = String.format("%02d", b);
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		sb.append(format);
		return sb.toString();
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			String result = function1(H,W,N);
			System.out.println(result);
		}
	}
}
