import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.math.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		while(T-->0) {
			String input = br.readLine();
			Stack<Character> stack = new Stack<>();
			boolean isbalance = true;
			for(int i=0; i<input.length(); i++) {
				  char c = input.charAt(i);
				  if(c == '(') {
					 stack.push('(');
				  } else {
					  if(stack.isEmpty()) {
						  isbalance = false;
					  } else {
						  stack.pop();
					  }
				  }
			}
			if(isbalance == true &&stack.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}