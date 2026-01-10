package com.dsa.toposort;

import com.dsa.graphs.basics.GraphCreation;

import java.util.*;

public class KahnsAlgo {

    public static void main(String args[]){
        String graph =
                "1 2,2 3,3 4,4 5";
        int numberOfNodes = 5;
        List<List<Integer>> graphList = GraphCreation.createGraph(graph, numberOfNodes, false);
        List<Integer> indegrees = new ArrayList<>(Collections.nCopies(numberOfNodes+1,0));

        for(int i = 1; i < graphList.size(); ++i){
            for(int j = 0; j < graphList.get(i).size(); ++j)
                indegrees.set(graphList.get(i).get(j), indegrees.get(graphList.get(i).get(j))+1);
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i < indegrees.size(); ++i){
            if(indegrees.get(i) == 0)
                queue.add(i);
        }
        performBFS(queue, graphList, indegrees);
    }

    private static void performBFS(Queue<Integer> queue,
                                   List<List<Integer>> graphList, List<Integer> indegrees) {
        Integer currNode;
        while(!queue.isEmpty()){
            currNode = queue.poll();
            System.out.print(currNode + " ");
            for(Integer vertex: graphList.get(currNode)){
                indegrees.set(vertex, indegrees.get(vertex)-1);
                if(indegrees.get(vertex) == 0)
                    queue.add(vertex);
            }
        }
    }
}
