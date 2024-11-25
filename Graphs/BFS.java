public static void bfs(ArrayList<Edge>[] graph, int curr, boolean[] vis){
  System.out.println(curr+" ");
  vis[curr] = true;

  for(int i = 0;i<graph[curr].size();i++){
    Edge e = graph[curr].get(i);
    if(!vis[e.dest]){
      dfs(graph,e.dest,vis);
    }
  }
}
