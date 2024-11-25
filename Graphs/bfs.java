class BFS{
  public static void(ArrayList<Edge>[] graph){
    Queue<Integer> q = new LinkedList<>();
    boolean vis[] = new boolean[graph.length];

    q.add(0);

    while(!q.isEmpty()){
      int curr = q.remove();

      if(!vis[curr]){
        System.out.print(curr + " ");
        vis[curr] = true;
        for(int i = 0;i<graph[curr].size();i++){
          Edge e = graph[curr].get(i);
          q.add(e.dest);
        }
      }
    }
  }
}
