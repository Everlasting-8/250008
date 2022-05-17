import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class GraphTest {

    Graph graph;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void init() {
        graph = new Graph(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(2, 5);
        graph.addEdge(4, 5);

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Nested
    class GraphTests {

        @Test
        public void test0() {
            graph.DFS(0);
            Assertions.assertEquals("0 1 3 4 5 2", outputStreamCaptor.toString()
                    .trim());
        }

        @Test
        public void test1() {
            graph.DFS(1);
            Assertions.assertEquals("1 3 4 5", outputStreamCaptor.toString()
                    .trim());
        }

        @Test
        public void test2() {
            graph.DFS(2);
            Assertions.assertEquals("2 4 5", outputStreamCaptor.toString()
                    .trim());
        }

        @Test
        public void test3() {
            graph.DFS(3);
            Assertions.assertEquals("3 4 5", outputStreamCaptor.toString()
                    .trim());
        }

        @Test
        public void test4() {
            graph.DFS(4);
            Assertions.assertEquals("4 5", outputStreamCaptor.toString()
                    .trim());
        }

        @Test
        public void test5() {
            graph.DFS(5);
            Assertions.assertEquals("5", outputStreamCaptor.toString()
                    .trim());
        }

    }
}
