import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i) - 'a']++;
		}
		return count;
	}
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String first = br.readLine();
       String second = br.readLine();
       int[] countA = getAlphabetCount(first);
       int[] countB = getAlphabetCount(second);
       int ans = 0;
       
       for(int i =0; i<26; i++) {
    	   ans += Math.abs(countA[i] - countB[i]);
       }
       System.out.println(ans);
    }
}