package com.dsa.graphs.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DepthFirstSearch {

    public static void main(String args[]){
        String graph =
                "1 2,1 3,2 4,3 4";
        int numberOfNodes = 4;
        List<List<Integer>> graphList = GraphCreation.createGraph(graph, numberOfNodes, true);
        //doing a one based indexing
        List<Boolean> visitedCheck = new ArrayList<>(Collections.nCopies(numberOfNodes + 1, Boolean.FALSE));
        int nodeNumber = 1;
        depthFirstSearch(graphList, nodeNumber, visitedCheck);
    }

    private static void depthFirstSearch(List<List<Integer>> graphList, int nodeNumber, List<Boolean> visitedCheck) {
        if(!visitedCheck.get(nodeNumber)){
            System.out.print(nodeNumber + " ");
            visitedCheck.set(nodeNumber, Boolean.TRUE);
            for(int vertex: graphList.get(nodeNumber)){
                depthFirstSearch(graphList, vertex, visitedCheck);
            }
        }
    }

}
