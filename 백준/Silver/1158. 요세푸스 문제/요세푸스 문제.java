import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.math.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
		for(int i=0; i<N; i++) {
			for(int j=1; j<K; j++) {
				queue.add(queue.poll());
			}
			arr[i] = queue.poll();
		}
		System.out.print("<" + Arrays.stream(arr)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(", ")) + ">");
		
	}
}
