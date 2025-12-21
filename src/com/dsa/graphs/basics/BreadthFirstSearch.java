package com.dsa.graphs.basics;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static com.dsa.graphs.basics.GraphCreation.printGraph;

public class BreadthFirstSearch {

    public static void main(String args[]){
        String graph =
                "1 2,1 3,2 4,3 4";
        List<List<Integer>> graphList = GraphCreation.createGraph(graph, 4, true);
        int nodeNumber = 1;
        breadthFirstSearch(graphList, nodeNumber);
    }

    private static void breadthFirstSearch(List<List<Integer>> graphList, int nodeNumber) {
        printGraph(graphList);
        if(nodeNumber > (graphList.size()-1)){
            System.out.println("Node is not present in the graph");
            return;
        }

        Queue<Integer> nodesQueue = new LinkedList<>();
        boolean[] visitedArray = new boolean[graphList.size()];
        int currNode = 0;

        nodesQueue.add(nodeNumber);
        visitedArray[nodeNumber] = true;

        while(!nodesQueue.isEmpty()){
            currNode = nodesQueue.poll();
            System.out.print(currNode+" ");

            for(Integer neighbor: graphList.get(currNode)){
                if(!visitedArray[neighbor]){
                    nodesQueue.add(neighbor);
                    visitedArray[neighbor] = true;
                }
            }
        }
    }


}
