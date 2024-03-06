import java.util.*;
import java.io.*;
import java.math.*;
import java.time.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char arr[] = new char[s.length()];
		arr = s.toCharArray();
		
		for(int i =0; i<s.length(); i++) {
			if(Character.isUpperCase(arr[i])){
				arr[i] = Character.toLowerCase(arr[i]);
			}else {
				arr[i] = Character.toUpperCase(arr[i]);
			}
		}
		
		String reslut = String.valueOf(arr);
		System.out.println(reslut);
	}
	
}