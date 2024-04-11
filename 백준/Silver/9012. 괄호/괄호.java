import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.math.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
			String answer = "YES";
			LinkedList<Character> list = new LinkedList<Character>();
			for(char c: br.readLine().toCharArray()) {
				list.add(c);
			}
			int i= 0;
			
			while(i<list.size()-1) {
				 
				 if(list.get(i).equals('(') && list.get(i+1).equals(')')) {
				
					list.remove(i+1);
					list.remove(i);
					i=0;
				} else {
					i++;
				}
			}
			if(!list.isEmpty()) answer = "NO";
			System.out.println(answer);	
		}
	}
}
