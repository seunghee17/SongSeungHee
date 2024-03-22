import java.io.*;
import java.util.*;
import java.math.*;

public class Main{

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<Integer>();
		int a=0;
		while(true) {
			list.add(N%B);
			a = N/B;
			N/=B;
			
			if(a==0) break;
			
		}
		
		Character[] arr = new Character[list.size()];
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i) < 10) {
				System.out.print(list.get(i));
			}else {
				arr[i] = (char)('A' + (list.get(i) - 10));
				System.out.print(arr[i]);
			}
			
		}
		
	}
}