import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    TNode root;

    public MyTree() {
    }

    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        while (true) {
            if (value <= current.value) {
                if (current.leftChild == null) {
                    // if left is null insert there !!!
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;// if current.leftChild != null

            } else {
                if (current.rightChild == null) {
                    // if right is null insert there !!!
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;// if current.rightChild != null
            }
        }
    }
    // *** PreOrder Traversal of the tree ***
    // *** Root-Left-Right                ***
    void preOrderTraversal(TNode root){
        if (root==null) return; // termination
        System.out.print(root.value +", "); //visit root
        preOrderTraversal(root.leftChild); // visit left subtree
        preOrderTraversal(root.rightChild); // visit right subtree
    }
    // **** InOrder Traversal of the tree  ****
    // **** Left-Root-Right                ****
    void inOrderTraversal(TNode root){
        if (root==null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }
    // ***** PostOrder Traversal of the tree  *****
    // ***** Left-Right-Root                  *****
    void postOrderTraversal(TNode root){
        if (root==null) return; //termination
        postOrderTraversal(root.leftChild);// visit left subtree
        postOrderTraversal(root.rightChild);// visit right subtre
        System.out.print(root.value + ", "); // visit root
    }
    //************************************
    void levelOrderTraversal(){
        if (root==null) return;
     Queue <TNode> queue = new LinkedList<>();
     queue.add(root);
     while (!queue.isEmpty()){
         TNode toVisit = queue.poll();
         System.out.print(toVisit.value+", ");
         // if you n number of children
         if (toVisit.leftChild!=null) queue.add(toVisit.leftChild);
         if (toVisit.rightChild!=null) queue.add(toVisit.rightChild);

     }
    }
    public boolean contains(int value){
        if (root == null) return false;
        TNode current = root;
        while (current!=null) {
            if (value < current.value) current = current.leftChild;
            else if (value > current.value) current = current.rightChild;
            else return true;
        }
        return false;
    }
    public boolean isLeaf(TNode node){
        return node.leftChild == null && node.rightChild == null;
    }

    public void printLeaves(TNode root){
        if (root==null) return;
        // perform visit on Root

        // Recursively Branch Left Subtree
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
        if (isLeaf(root)) System.out.print(root.value + ", ");

        // Recursively Branch Right Subtree
    }
    int countLeaves(TNode root){
        if (root == null) return 0 ;
        if (isLeaf(root)) return 1 ;
        // recursively left
        //recursively  right
        return countLeaves(root.leftChild) + countLeaves(root.rightChild);

    }
    int findSumOfLeaves(TNode root){

        if (root == null) return 0 ;
        if (isLeaf(root)) return root.value;

        return findSumOfLeaves(root.leftChild) + findSumOfLeaves(root.rightChild);
    }
    int height(TNode root){

        if (root == null) return -1;
        if (isLeaf(root)) return 0;

        return 1 + Math.max(height(root.rightChild), height(root.rightChild));
    }
    public int calculateNodeDepthSums(){

        return nodeDepthSums(root,0);
    }
     // Assignment Sum of Node Depths
     public int nodeDepthSums(TNode node, int A){

        if (node == null) return  0;

        return A+nodeDepthSums(node.leftChild, A+1)+nodeDepthSums(node.rightChild, A+1);
     }
    // Assignment Sum of Node Depths
}
