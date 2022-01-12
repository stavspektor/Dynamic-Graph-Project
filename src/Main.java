public class Main {

    public static void main(String[] args) {
	DynamicGraph graph1 = new DynamicGraph();
	graph1.insertNode(1);
	graph1.insertNode(2);
	graph1.insertNode(3);
	graph1.deleteNode(graph1.nodeHead.next);
	GraphNode tempnode = new GraphNode(0);
	tempnode = graph1.nodeHead;
	while (tempnode.next!=null) {
		System.out.println(tempnode.key);
		System.out.println("--->");
		tempnode = tempnode.next;
	}

	System.out.println(tempnode.key);
		RootedTree t1 = new RootedTree();
		t1.root = new GraphNode(0);
		GraphNode n1 = t1.addChild(t1.root, 1);
		GraphNode n2 = t1.addChild(t1.root, 2);
		t1.addSibling(n1, 3);
		t1.addSibling(n1, 3);
	    t1.traverseTree(t1.root);
    }

}
