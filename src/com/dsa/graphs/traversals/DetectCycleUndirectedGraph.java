package com.dsa.graphs.traversals;

import com.dsa.graphs.basics.GraphCreation;
import com.dsa.graphs.common.Pair;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DetectCycleUndirectedGraph {

    public static void main(String args[]){
        String graph =
            "1 2,2 3,3 4,4 5,5 1";
        int numberOfNodes = 5;
        List<List<Integer>> graphList = GraphCreation.createGraph(graph, numberOfNodes, true);
        boolean[] visited = new boolean[numberOfNodes+1];
        boolean isCycleExists = false;
        for(int i = 1; i <= numberOfNodes; ++i){
            if(!visited[i]){
                isCycleExists = detectCycleUsingBFS(graphList, visited, i);
                if(isCycleExists)
                    break;
            }
        }
        System.out.println("Does a cycle exists in the current graph: "+ isCycleExists);
    }

    private static boolean detectCycleUsingBFS(List<List<Integer>> graphList, boolean[] visited,
                                               int source){

        Queue<Pair> queue = new LinkedList<>();
        Pair pair = new Pair(source, -1);
        queue.add(pair);
        visited[source] = true;
        Pair currPair = null;

        while (!queue.isEmpty()) {
            currPair = queue.poll();
            for(int i : graphList.get(currPair.getElement1())){
                if(!visited[i]){
                    queue.add(new Pair(i, currPair.getElement1()));
                    visited[i] = true;
                }
                else if(currPair.getElement2() != i){
                    return true;
                }
            }
        }
        return false;
    }
}
