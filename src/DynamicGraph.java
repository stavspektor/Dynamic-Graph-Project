public class DynamicGraph {
    GraphNode head;

    public DynamicGraph(){
        DynamicGraph dynamicGraph = new DynamicGraph();
        this.head = null;
    }

    public GraphNode insertNode(int nodeKey){
        GraphNode newNode = new GraphNode(nodeKey);
        if (this.head != null) {
            this.head.prev = newNode;
            newNode.next = this.head;
        }
        this.head = newNode;
        return this.head;
    }

    public void deleteNode(GraphNode node){
        if (node.inSum == 0 && node.outSum == 0){
            if (node.next == null){ // might have mistakes!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                node.prev.next = null;
            }
            else if (node.prev == null){
                node.next.prev = null;
            }
            else {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
        }
    }

    public GraphEdge insertEdge(GraphNode from,GraphNode to){
        GraphEdge graphEdge = new GraphEdge(from,to);
        return graphEdge;
        // not finished!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }

    public void deleteEdge(GraphEdge edge){

    }

    public RootedTree scc(){

    }

    public RootedTree bfs(GraphNode source){

    }
}
