
import java.io.*;
import java.util.*;
import java.math.*;

public class Main { 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return o1.length() - o2.length();
			}
		});
		System.out.println(arr[0]);
		for(int i=1; i<N; i++) {
			if(!arr[i-1].equals(arr[i])) {
				System.out.println(arr[i]);
			}
		}  
	}
 
}