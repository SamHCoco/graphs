package com.samhcoco.graphs.graphs.traversal.dfs;

import java.util.*;

public class GraphDfsTraversal {

    public static List<String> traversePreOrder(Map<String, List<String>> graph, String startNode) {

        List<String> visited = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        String node = startNode;
        stack.add(node);

        while (!stack.isEmpty()) {
            visited.add(node);
            stack.pop();
            List<String> neighbours = graph.get(node);

            if (!Objects.isNull(neighbours)) {
                if (neighbours.size() == 1) {
                    stack.add(neighbours.iterator().next());
                } else {
                    neighbours.forEach(neighbour -> stack.add(0, neighbour));
                }
            }

            if (!stack.isEmpty()) {
                node = stack.peek();
            }
        }
        return visited;
    }

}
