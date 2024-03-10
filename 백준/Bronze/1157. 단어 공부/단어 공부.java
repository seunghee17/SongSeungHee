import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if('A' <= ch && ch <= 'Z') {
				count[ch-'A']++;
			}else {
				count[ch-'a']++;
			}
		}
		return count;
	}
	

    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       
       int count[] = getAlphabetCount(str);
       int max = -1;
       char maxAlphabet = '?';
       for(int i=0; i<26; i++) {
    	   if(max < count[i]) {
    		   max = count[i];
    		   maxAlphabet = (char)('A' + i);
    	   }else if(max == count[i]) {
    		   maxAlphabet = '?';
    	   }
       }
       System.out.println(maxAlphabet);
       br.close();
    }
}