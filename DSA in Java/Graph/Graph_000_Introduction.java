import java.util.*;

public class Graph_000_Introduction{
    public static void main(String[] args) {
        int vertex = 7;
        ArrayList<Edge> graph [] = new ArrayList[vertex];
        createGraph(graph);
        BFS(graph);
        System.out.println();
        DFS(graph,0,new boolean[vertex]);
        System.out.println();
        System.out.println(hasPath(graph,0,10,new boolean[vertex]));
    }
    static class Edge{
        int source;
        int destination;
        int weight;

        public Edge(int src, int dest, int wt){
            this.source = src;
            this.destination = dest;
            this.weight = wt;  
        }
    }
    // O(V+E) --> Adjacency List || O(V^2) -> Via Matrix
    public static void BFS(ArrayList<Edge> graph[]){

        Queue <Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];

        queue.add(0);
        while(!queue.isEmpty()){
            int current = queue.remove();
            if(!visited[current]){
                System.out.print(current+" ");
                visited[current] = true;
                for(int i = 0; i<graph[current].size(); i++ ){
                    Edge e = graph[current].get(i); 
                    queue.add(e.destination); 
                } 
            }
        }

    }
    // O(V+E) --> Adjacency List 
    public static void DFS(ArrayList<Edge> graph[], int current, boolean visited[]){

        System.out.print(current + " ");
        visited[current] = true;
        for(int i = 0; i < graph[current].size();i++){
            Edge e = graph[current].get(i);
              if(!visited[e.destination]){
                DFS(graph,e.destination,visited);
            }
        }
    }
//Example Execution
// For vertex 3:

// graph[3] = [Edge(3,1,1), Edge(3,4,1), Edge(3,5,1)];
// When i = 1:
// Edge e = graph[3].get(1); retrieves:
// Edge(3,4,1)
// e.destination is 4, so:
// In BFS: Vertex 4 is added to the queue.
// In DFS: Recursive call is made for vertex 4.

    public static boolean hasPath(ArrayList<Edge> graph[], int source, int destination, boolean visited[]){
        if(source == destination){
            return true;
        }
        visited[source] = true;
        for(int i = 0; i<graph[source].size();i++){
            Edge e = graph[source].get(i); 
            if(!visited[e.destination] &&hasPath(graph,e.destination, destination, visited)){
                return true;
            }
        }
         

        return false;
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i< graph.length ; i ++){
            graph[i] = new ArrayList<>();
        }

        // 0 Vertex
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        
        // 1 Vertex
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        
        // 2 Vertex
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,4,1));
        
        // 3 Vertex
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        // 4 Vertex
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        // 5 Vertex
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));
        
        // 6 Vetex
        graph[6].add(new Edge(6,5,1));


        // 2's Neighbour
        for (int i =0; i<graph[2].size();i++){
            Edge e = graph[2].get(i);
        }

        // Now print all edges for each vertex
        for (int i = 0; i < graph.length; i++) {
            System.out.println("Vertex " + i + " edges:");
            for (Edge edge : graph[i]) {
                System.out.println("To Vertex " + edge.destination + " with weight " + edge.weight);
            }
        }
    }
}