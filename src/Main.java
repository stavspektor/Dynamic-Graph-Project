public class Main {

    public static <String> void main(String[] args) {
	DynamicGraph graph1 = new DynamicGraph();
	graph1.insertNode(1);
	graph1.insertNode(2);
	GraphNode tempnode = new GraphNode(0);
	tempnode = graph1.nodeHead;
	while (tempnode.next!=null) {
		System.out.println(graph1.nodeHead.key);
		System.out.println("--->");
		tempnode = tempnode.next;
	}
    }
}
