import java.io.DataOutputStream;

public class RootedTree {
    GraphNode root;

    public RootedTree(){
        this.root = null;
    }

    public void printByLayer(DataOutputStream out){

    }

    public void preorderPrint(DataOutputStream out){

    }



    public GraphNode addSibling(GraphNode node, int key)
    {
        if(node == this.root){
            return null;
        }
        if(node == null){
            return null;
        }
        while(node.right_sibling != null){
            node = node.right_sibling;
        }
        return(node.right_sibling = new GraphNode(key));
    }


     public GraphNode addChild(GraphNode node, int key) {
         if (node == null) {
             return null;
         }

         if (node.left_child != null) {
            GraphNode tempnode = addSibling(node.left_child, key);
             return tempnode;
         }
         
        else{
             node.left_child = new GraphNode(key);
             return (node.left_child);
         }
     }

    // Traverses tree in level order
     public void traverseTree(GraphNode root)
    {
        if(root == null)
            return;
        while(root != null)
        {
            System.out.print(root.key + " ");
            if(root.left_child != null)
                traverseTree(root.left_child);
            root = root.right_sibling;
        }
    }
}






//    /* Function to line by line print level order traversal a tree*/
//    static void printLevelOrder(Node root)
//    {
//        int h = height(root);
//        int i;
//        for (i=1; i<=h; i++)
//        {
//            printGivenLevel(root, i);
//            System.out.println();
//        }
//    }
//    /* Print nodes at a given level */
//    void printGivenLevel(Node root, int level)
//    {
//        if (root == null)
//            return;
//        if (level == 1)
//            System.out.println(root.data);
//        else if (level > 1)
//        {
//            printGivenLevel(root.left, level-1);
//            printGivenLevel(root.right, level-1);
//        }
//    }