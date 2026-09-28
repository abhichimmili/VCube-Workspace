package dsa.searchings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSDemo {

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
		
		dfs(graph);
		System.out.println();
		dfs(0,new boolean[graph.size()],graph);
	}

	private static void dfs(int node, boolean[] visited, List<List<Integer>> graph) {
		visited[node]=true;
		System.out.print(node+" ");
		for(int neighbours:graph.get(node)) {
			if(!visited[neighbours]) {
				dfs(neighbours,visited,graph);
			}
		}
	}

	private static void dfs(List<List<Integer>> graph) {
		boolean[] visited=new boolean[graph.size()];
		Stack<Integer> stack = new Stack<>();
		
		int start=0;
		visited[start]=true;
		stack.push(start);
		while(!stack.isEmpty()){
			int node=stack.pop();
			System.out.print(node+" ");
			for(int neighbours:graph.get(node)) {
				if(!visited[neighbours]) {
					stack.push(neighbours);
					visited[neighbours]=true;
				}
			}
//			for (int i = graph.get(node).size() - 1; i >= 0; i--) {
//
//			    int neighbour = graph.get(node).get(i);
//
//			    if (!visited[neighbour]) {
//			        stack.push(neighbour);
//			        visited[neighbour] = true;
//			    }
//			}
		}
	}

}
