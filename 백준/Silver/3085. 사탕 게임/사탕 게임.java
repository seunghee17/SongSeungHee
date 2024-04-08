import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	
	public static void swapCandy(char[][] map, int r1, int c1, int r2, int c2) {
		char temp = map[r1][c1];
		map[r1][c1] = map[r2][c2];
		map[r2][c2] = temp;
	}
	
	public static int findmaxColumn(char[][] map) {
		int N = map.length;
		int max = 0;
		for(int r = 0; r < N; r++) {
			int len = 1;
			
			for(int c = 1; c < N; c++) {
				if(map[r][c] == map[r][c-1]) {
					len++;
					max = Math.max(max, len);
				}else {
					max = Math.max(max, len);
					len = 1;
				}
				
			}
			max = Math.max(max, len);
			
		}
		return max;
	}
	
	public static int findmaxRow(char[][] map) {
		int N = map.length;
		int max = 0;
		for(int c = 0; c < N; c++) {
			int len = 1;
			
			for(int r = 1; r < N; r++) {
				if(map[r][c] == map[r-1][c]) {
					len++;
					max = Math.max(max, len);
				}else {
					max = Math.max(max, len);
					len = 1;
				}
				
			}
			max = Math.max(max, len);
			
		}
		return max;
	}
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		char[][] map = new char[N][N];
		for(int i = 0; i<N; i++) {
			map[i] = sc.next().toCharArray();
		}
		for(int i =0; i<N; i++) {
			for(int j =0; j<N; j++) {
				if( j+1 <N && map[i][j] != map[i][j+1]) {
					swapCandy(map, i, j, i, j+1);
					max = Math.max(max, Math.max(findmaxColumn(map), findmaxRow(map)));
					swapCandy(map, i, j, i, j+1);
				}
				if(i+1<N && map[i][j] != map[i+1][j]) {
					swapCandy(map, i, j, i+1, j);
					max = Math.max(max, Math.max(findmaxColumn(map), findmaxRow(map)));
					swapCandy(map, i, j, i+1, j);
				}
			}
			
		}
		System.out.println(max);
	}
}