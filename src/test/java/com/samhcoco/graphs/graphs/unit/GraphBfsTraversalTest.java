package com.samhcoco.graphs.graphs.unit;


import com.samhcoco.graphs.graphs.bfs.GraphBfsTraversal;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class GraphBfsTraversalTest {

    @Test
    public void testTraverse() {
        Map<String, List<String>> graph = Map.of(
                "a", Arrays.asList("b", "c"),
                "b", Arrays.asList("d"),
                "c", Arrays.asList("e", "f")
        );

        List<String> expected = List.of("a", "b", "c", "d", "e", "f");

        final List<String> result = GraphBfsTraversal.traverse(graph, "a");

        assertIterableEquals(result, expected);
    }

}
