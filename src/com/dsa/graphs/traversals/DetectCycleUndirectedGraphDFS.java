package com.dsa.graphs.traversals;

import com.dsa.graphs.basics.GraphCreation;
import com.dsa.graphs.common.Pair;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DetectCycleUndirectedGraphDFS {

    public static void main(String args[]){
        String graph =
            "1 2,2 3,3 4,4 5,5 1";
        int numberOfNodes = 5;
        List<List<Integer>> graphList = GraphCreation.createGraph(graph, numberOfNodes, true);
        boolean[] visited = new boolean[numberOfNodes+1];
        boolean isCycleExists = false;
        for(int i = 1; i <= numberOfNodes; ++i){
            if(!visited[i]){
                visited[i] = true;
                isCycleExists = detectCycleUsingDFS(graphList, visited, i, -1);
                if(isCycleExists)
                    break;
            }
        }
        System.out.println("Does a cycle exists in the current graph: "+ isCycleExists);
    }

    private static boolean detectCycleUsingDFS(List<List<Integer>> graphList, boolean[] visited,
                                               int source, int parent) {

        for(int vertex: graphList.get(source)){
            if(!visited[vertex]){
                visited[vertex] = true;
                if(detectCycleUsingDFS(graphList, visited, vertex, source))
                    return true;
            }
            else if(vertex != parent){
                return true;
            }
        }
        return false;
    }
}
