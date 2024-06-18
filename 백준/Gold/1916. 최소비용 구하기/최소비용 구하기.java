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
		int v = Integer.parseInt(br.readLine()); //5
		int e = Integer.parseInt(br.readLine()); //8
		ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
		for(int i=0; i<v+1; i++) {
			graph.add(new ArrayList<>());
		}
		for(int i=0; i<e; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			graph.get(start).add(new Node(end,cost));
		}
		StringTokenizer sr = new StringTokenizer(br.readLine(), " ");
		int startcity = Integer.parseInt(sr.nextToken());
		int endcity = Integer.parseInt(sr.nextToken());
		
		boolean[] visited = new boolean[v+1];
		int[] dist = new int[v+1];
		for(int i=1; i<v+1; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		//출발~출발 은 최소 0
		dist[startcity] = 0;
		for(int i=0; i<v; i++) {
			int node_val = Integer.MAX_VALUE;
			int idx = 0;
			for(int j=1; j<v+1; j++) {
				//현재까지 발견된것보다 더 짧은 경로 찾기 위한 조건 
				if(!visited[j] && dist[j] < node_val) {
					node_val = dist[j];
					idx = j;
				}
			}
			visited[idx] = true;
			for(int j=0; j<graph.get(idx).size(); j++) {
				int index = graph.get(idx).get(j).idx;
				int cost = graph.get(idx).get(j).cost;
				if(dist[index] > dist[idx] + cost) {
					dist[index] = dist[idx] + cost;
				}
			}
		}
		System.out.println(dist[endcity]);
 	}
	
	

}
