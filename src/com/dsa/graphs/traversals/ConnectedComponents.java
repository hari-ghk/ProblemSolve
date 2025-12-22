package com.dsa.graphs.traversals;

import com.dsa.graphs.basics.GraphCreation;

import java.util.*;

public class ConnectedComponents {

    public static void main(String args[]){
        String graph =
                "1 2,2 3,3 4,5 6";
        int numberOfNodes = 7;
        List<List<Integer>> graphList = GraphCreation.createGraph(graph, numberOfNodes, true);
        boolean[] visited = new boolean[numberOfNodes+1];
        int connectedComponents = 0;

        for(int i = 1; i <= numberOfNodes; ++i){
            if(!visited[i]){
                visited[i] = true;
                ++connectedComponents;
                findNumberOfComponent(i, graphList, visited);
            }
        }
        System.out.println("Total connected components are: "+ connectedComponents);
    }

    private static void findNumberOfComponent(int V, List<List<Integer>> edges, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        int currentVertex = 0;

        while(!queue.isEmpty()){
            currentVertex = queue.poll();

            for(Integer neighbor : edges.get(currentVertex)){
                if(!visited[neighbor]){
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
