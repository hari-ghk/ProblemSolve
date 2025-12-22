package com.dsa.graphs.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GraphCreation {

    public static List<List<Integer>> createGraph(String edges, int numOfNodes, boolean isUndirected) {

        List<List<Integer>> graph = IntStream.rangeClosed(0, numOfNodes)
                .mapToObj(i -> new ArrayList<Integer>())
                .collect(Collectors.toList());

        String [] edgesArray = edges.split(",");
        int u = 0;
        int v = 0;
        for(int i = 0; i < edgesArray.length; ++i){
            u = Integer.parseInt(edgesArray[i].split(" ")[0].trim());
            v = Integer.parseInt(edgesArray[i].split(" ")[1].trim());
            graph.get(u).add(v);
            if(isUndirected)
                graph.get(v).add(u);
        }
        printGraph(graph);
        return graph;
    }

    public static void printGraph(List<List<Integer>> graph) {

        if(graph == null || graph.isEmpty() || graph.size() == 1) {
            System.out.print("No entries in the adjacency list");
            return;
        }

        for(int i = 1; i <graph.size(); ++i){
            System.out.print(i+"--- " );
            for(int j = 0; j < graph.get(i).size(); ++j){
                System.out.print(graph.get(i).get(j));
                if(j != (graph.get(i).size()-1))
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
