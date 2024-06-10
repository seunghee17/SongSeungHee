import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long D[] = new long[1001];
		D[1] = 1; //가로가 1일때 타일 채우는 경우의 수 
		D[2] = 2; // 가로가 2일때 타일 채우는 경우의 수 
		for(int i=3; i<=n; i++) {
			D[i] = (D[i-1] + D[i-2]) % 10007;
		}
		System.out.println(D[n]);
	}

}