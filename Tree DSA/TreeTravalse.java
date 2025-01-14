public class TreeTravalse {

    Node root;


    public static void main(String[] args) {
        TreeTravalse tree = new TreeTravalse();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        // tree.printPostOrder(tree.root);
        tree.printPreOrder(tree.root);
        // tree.printPostOrder(tree.root);

    }
//post order
    public void printPostOrder(Node node){
        if(node == null){
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(" "+node.key);
    }

    //pre order 
    public void printPreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(" "+node.key);
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    
}
