import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.math.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			StringTokenizer sr = new StringTokenizer(br.readLine(), " ");
		
			Queue<Integer> pq1 = new LinkedList<>();
			Queue<Integer> pq2 = new LinkedList<>();
			int max = 0;
			int cnt = 0;
			for(int i =0; i<N; i++) {
				pq1.offer(i);
				int n = Integer.parseInt(sr.nextToken());
				pq2.offer(n);
			}
			
			while(!pq1.isEmpty()) {
				max = Collections.max(pq2);
				if(max != pq2.peek()) {
					pq1.add(pq1.poll());
					pq2.add(pq2.poll());
				} else {
					if(pq1.poll() == M) {
						pq2.poll();
						cnt++;
						break;
					} else {
						pq2.poll();
						cnt++;
						
					}
				}
			}
			System.out.println(cnt);
		}
		
		
	}
}