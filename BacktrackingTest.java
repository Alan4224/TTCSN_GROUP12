import java.time.Instant;
import java.time.Duration;
import java.util.Set;

public class BacktrackingTest implements Test {

    private void printResults(String testName, Set<Integer> MIS, Duration timeElapsed) {
        System.out.println(testName);
        System.out.println("Maximum Independent Set (Backtracking):");
        System.out.println(MIS);
        System.out.println("Size: " + MIS.size());
        System.out.println("Execution time: " + timeElapsed.toNanos() + " nanoseconds");
        System.out.println();
    }

    // Trường hợp 1: Đồ thị không liên thông
    @Override
    public void testDisconnectedGraph() {
        Instant start = Instant.now();

        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        MISUsingBackTrackAlgorithm backTrack = new MISUsingBackTrackAlgorithm();
        Set<Integer> MIS = backTrack.findMIS(graph);

        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);

        printResults("Test 1 (Disconnected graph)", MIS, timeElapsed);
    }

    // Trường hợp 2: Đồ thị đầy đủ
    @Override
    public void testFullyConnectedGraph() {
        Instant start = Instant.now();

        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        MISUsingBackTrackAlgorithm backTrack = new MISUsingBackTrackAlgorithm();
        Set<Integer> MIS = backTrack.findMIS(graph);

        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);

        printResults("Test 2 (Fully connected graph)", MIS, timeElapsed);
    }

    // Trường hợp 3: Đồ thị cây
    @Override
    public void testTreeGraph() {
        Instant start = Instant.now();

        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        MISUsingBackTrackAlgorithm backTrack = new MISUsingBackTrackAlgorithm();
        Set<Integer> MIS = backTrack.findMIS(graph);

        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);

        printResults("Test 3 (Tree graph)", MIS, timeElapsed);
    }

    // Trường hợp 4: Đồ thị có nhiều đỉnh, nhiều cạnh
    @Override
    public void testLargeAndComplexGraph() {
        Instant start = Instant.now();

        Graph graph = new Graph(9);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(3, 6);
        graph.addEdge(4, 5);
        graph.addEdge(4, 7);
        graph.addEdge(5, 8);
        graph.addEdge(6, 7);
        graph.addEdge(7, 8);
        MISUsingBackTrackAlgorithm backTrack = new MISUsingBackTrackAlgorithm();
        Set<Integer> MIS = backTrack.findMIS(graph);

        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);

        printResults("Test 4 (Complex graph)", MIS, timeElapsed);
    }
}