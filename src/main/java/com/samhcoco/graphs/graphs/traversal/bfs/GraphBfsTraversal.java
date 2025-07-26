package com.samhcoco.graphs.graphs.traversal.bfs;

import java.util.*;

public class GraphBfsTraversal {

    public static List<String> traverse(Map<String, List<String>> graph, String startNode) {
        List<String> visited = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        String node = startNode;
        queue.add(node);

        while (!queue.isEmpty()) {
            List<String> neighbourNodes = graph.get(node);
            if (neighbourNodes != null) {
                neighbourNodes.forEach(neighbour -> queue.add(neighbour));
            }
            visited.add(queue.remove());
            node = queue.peek();
        }

        return visited;
    }

}
