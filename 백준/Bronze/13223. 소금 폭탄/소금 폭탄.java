import java.io.*;
import java.util.*;


public class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String first = br.readLine();
		StringTokenizer st1 = new StringTokenizer(first, ":");
		String second = br.readLine();
		StringTokenizer st2 = new StringTokenizer(second, ":");
		int[] arrf = new int[3];
		int[] arrs = new int[3];
		int[] result = new int[3];
		for(int i=0; i<3; i++) {
			arrf[i] = Integer.parseInt(st1.nextToken());
			arrs[i] = Integer.parseInt(st2.nextToken());			
		}
		int currentTime = arrf[0] * 3600 + arrf[1] * 60 + arrf[2];
		int dropTime = arrs[0] * 3600 + arrs[1] * 60 + arrs[2];
		int resultTime = dropTime - currentTime;
		if(resultTime <= 0) {
			resultTime += 24 * 3600;
		}
		result[0] = resultTime / 3600;
		result[1] = (resultTime % 3600) /60;
		result[2] = (resultTime % 3600) % 60;
		System.out.printf("%02d:%02d:%02d", result[0], result[1], result[2]);
		br.close();
	}
}
