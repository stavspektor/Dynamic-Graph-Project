public class GraphNode {
    int key;
    int inSum;
    int outSum;
    GraphNode prev;
    GraphNode next;
    GraphNode neighbors;
    GraphNode left_child;
    GraphNode right_sibling;
    GraphNode parent;

    public GraphNode(int key) {
        this.key = key;
        this.prev = null;
        this.next = null;
        this.inSum = 0;
        this.outSum = 0;
        this.left_child = null;
        this.right_sibling = null;
        this.parent = null;
        this.neighbors = null;
    }

    public int getOutDegree(){
        return this.outSum;
    }

    public int getInDegree(){
        return this.inSum;
    }

    public int getKey(){
        return this.key;
    }
}
