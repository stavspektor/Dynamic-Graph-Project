public class GraphNode {
    int key;
    int inSum;
    int outSum;
    GraphNode prev;
    GraphNode next;

    public GraphNode(int key) {
        this.key = key;
        this.prev = null;
        this.next = null;
        this.inSum = 0;
        this.outSum = 0;
    }

    public int getOutDegree(){
        return outSum;
    }

    public int getInDegree(){
        return inSum;
    }

    public int getKey(){
        return key;
    }
}
