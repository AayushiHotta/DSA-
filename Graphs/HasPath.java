public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis){
  //1. src == dest -- true
  //2. if(!vis[neigh] && hasPaht(neigh,dest) -- true
  //return false

  if(src == dest){
    return true;
  }
  for(int i = 0;i<graph[src].size();i++){
    Edge e = graph[src].get(i);
    if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
      return true;
    }
  }
  return false;
}
