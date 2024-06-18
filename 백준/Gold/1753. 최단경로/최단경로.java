import java.io.*;
import java.util.*;
import java.math.*;

class Node {
	int idx; 
	int cost;
	
	Node(int idx, int cost) {
		this.idx = idx;
		this.cost = cost;
	}
}


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
		for(int i=0; i<v+1; i++) {
			graph.add(new ArrayList<>());
		}
		// 연결리스트를 모두 완성하는 반복문 
		for(int i=0; i<e; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			graph.get(u).add(new Node(end, w));
		}
		boolean[] visited = new boolean[v+1];
		int[] dist = new int[v+1];
		
		//최소거리 담을 dist 배열 초기화한다
		//최소거리를 담아야하기 때문에 최대한 큰값으로 초기화한다 
		for(int i=0; i<v+1; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		//시작점에서의 최단거리는 무조건 0이기에 0할당 
		dist[start] = 0;
		
		for(int i=1; i<v+1; i++) {
			int node_val = Integer.MAX_VALUE;
			int nodeidx=0;
			//모든 정점을 탐색하기 위함이다 -확인하기 
			for(int j=1; j<v+1; j++) {
				if(!visited[j] && dist[j]<node_val) {
					node_val = dist[j];
					nodeidx = j;
				}
			}
			visited[nodeidx] = true;
			//방문한 지점 기준으로 인접노드의 최소거리값 갱신한다 
			for(int j=0; j<graph.get(nodeidx).size(); j++) {
				Node nod = graph.get(nodeidx).get(j);
				if(dist[nod.idx] > dist[nodeidx] + nod.cost ) {
					dist[nod.idx] = dist[nodeidx] + nod.cost;
				}
			}
		}
		for(int i=1; i<v+1; i++) {
			if(dist[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
			} else {
				System.out.println(dist[i]);
			}
		}
 	}
	
	

}