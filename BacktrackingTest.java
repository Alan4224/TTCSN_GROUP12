import java.util.Set;

public class BacktrackingTest {
    // Trường hợp 1: Đồ thị không liên thông
    public static void testDisconnectedGraph() {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        MISUsingBackTrackAlgorithm backTrack = new MISUsingBackTrackAlgorithm();
        Set<Integer> MIS = backTrack.findMIS(graph);
        System.out.println("Test 1 (Disconnected graph)");
        System.out.println("Maximum Independent Set (Backtracking):");
        System.out.println(MIS);
        System.out.println("Size: " + MIS.size());
    }

    // Trường hợp 2: Đồ thị đầy đủ
    public static void testFullyConnectedGraph() {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        MISUsingBackTrackAlgorithm backTrack = new MISUsingBackTrackAlgorithm();
        Set<Integer> MIS = backTrack.findMIS(graph);
        System.out.println("Test 2 (Fully connected graph)");
        System.out.println("Maximum Independent Set (Backtracking):");
        System.out.println(MIS);
        System.out.println("Size: " + MIS.size());
    }

    // Trường hợp 3: Đồ thị cây
    public static void testTreeGraph() {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        MISUsingBackTrackAlgorithm backTrack = new MISUsingBackTrackAlgorithm();
        Set<Integer> MIS = backTrack.findMIS(graph);
        System.out.println("Test 3 (Tree graph)");
        System.out.println("Maximum Independent Set (Backtracking):");
        System.out.println(MIS);
        System.out.println("Size: " + MIS.size());
    }

    // Trường hợp 4: Đồ thị có nhiều đỉnh, nhiều cạnh
    public static void testLargeAndComplexGraph() {
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
        System.out.println("Test 4 (Complex graph)");
        System.out.println("Maximum Independent Set (Backtracking):");
        System.out.println(MIS);
        System.out.println("Size: " + MIS.size());
    }

}
