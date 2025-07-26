package com.samhcoco.graphs.graphs.unit.traversal.dfs;

import com.samhcoco.graphs.graphs.traversal.dfs.GraphDfsTraversal;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class GraphDfsTraversalTest {

    @Test
    public void testTraversePreOrder() {
        Map<String, List<String>> graph = Map.of(
                "a", Arrays.asList("b", "c"),
                "b", Arrays.asList("d"),
                "c", Arrays.asList("e", "f"),
                "f", Arrays.asList("g")
        );

        final List<String> expected = List.of("a", "b", "d", "c", "e", "f", "g");
        final List<String> result = GraphDfsTraversal.traversePreOrder(graph, "a");

        assertIterableEquals(result, expected);
    }

}
