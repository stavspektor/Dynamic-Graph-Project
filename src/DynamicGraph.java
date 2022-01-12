public class DynamicGraph {
    GraphNode nodeHead;
    GraphEdge edgeHead;

    public DynamicGraph(){
        this.nodeHead = null;
        this.edgeHead = null;
    }

    public GraphNode insertNode(int nodeKey){
        GraphNode newNode = new GraphNode(nodeKey);
        if (this.nodeHead != null) {
            this.nodeHead.prev = newNode;
            newNode.next = this.nodeHead;
        }
        this.nodeHead = newNode;
        return this.nodeHead;
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
        GraphEdge newEdge = new GraphEdge(from,to);
        if (this.edgeHead != null) {
            this.edgeHead.prev = newEdge;
            newEdge.next = this.edgeHead;
        }
        this.edgeHead = newEdge;
        newEdge.to.inSum +=1;
        newEdge.from.outSum +=1;
        return newEdge;
    }

    public void deleteEdge(GraphEdge edge){
        if (edge.next == null){ // might have mistakes!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            edge.prev.next = null;
        }
        else if (edge.prev == null){
            edge.next.prev = null;
        }
        else {
            edge.prev.next = edge.next;
            edge.next.prev = edge.prev;
        }
        edge.to.inSum -=1;
        edge.from.outSum -=1;
    }

//    public RootedTree scc(){
//
//    }
//
//    public RootedTree bfs(GraphNode source){
//
//    }
}
