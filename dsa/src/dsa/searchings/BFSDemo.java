package dsa.searchings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSDemo {

	public static void main(String[] args) {
		List<List<Integer>> graph = new ArrayList<>();
		
		int v=6;
		for(int i=0;i<v;i++) {
			graph.add(new ArrayList<>());
		}
		
		graph.get(0).add(1);
		graph.get(0).add(2);
		graph.get(1).add(3);
		graph.get(2).add(5);
		graph.get(2).add(4);
		
		bfs(graph);
	}

	private static void bfs(List<List<Integer>> graph) {
		boolean[] visited=new boolean[graph.size()];
		Queue<Integer> q= new LinkedList<>();
		
		int start=0;
		visited[start]=true;
		q.add(start);
		
		while(!q.isEmpty()) {
			int node=q.poll();
			System.out.print(node+" ");
			for(int neighbours:graph.get(node)) {
				if(!visited[neighbours]) {
					q.add(neighbours);
					visited[neighbours]=true;
				}
			}
		}
	}

}
