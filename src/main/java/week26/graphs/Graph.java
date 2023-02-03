package week26.graphs;

import java.util.*;

class Graph {
    private int Vertices;   // No. of vertices

    // adjacency list declaration
    private LinkedList<Integer> adj_list[];

    private Map<Integer, LinkedList<Integer>> adjMap;

    // graph Constructor: to initialize adjacency lists as per no of vertices
    Graph(int v) {
        Vertices = v;
        adj_list = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj_list[i] = new LinkedList();
    }

    //add an edge to the graph
    void addEdge(int v, int w) {
        adj_list[v].add(w);  // Add w to v's list.
    }

    // helper function for DFS technique
    void DFS_helper(int v,boolean visited[]) {
        // current node is visited
        visited[v] = true;
        System.out.print(v+" ");

        // process all adjacent vertices
        Iterator<Integer> i = adj_list[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFS_helper(n, visited);
        }
    }


    void DFS(int v) {
        //initially none of the vertices are visited
        boolean visited[] = new boolean[Vertices];

        // call recursive DFS_helper function for DFS technique
        DFS_helper(v, visited);
    }

    // BFS traversal from the root_node
    void BFS(int root_node)   {
        // initially all vertices are not visited
        boolean visited[] = new boolean[Vertices];

        // BFS queue
        Queue<Integer> queue = new LinkedList<Integer>();

        // current node = visited, insert into queue
        visited[root_node]=true;
        queue.add(root_node);

        while (queue.size() != 0)  {
            // deque an entry from queue and process it
            root_node = queue.poll();
            System.out.print(root_node+" ");

            // get all adjacent nodes of current node and process
            Iterator<Integer> i = adj_list[root_node].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}