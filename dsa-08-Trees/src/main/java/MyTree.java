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
        if (root==null) return;
        System.out.print(root.value +", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }
    // **** InOrder Traversal of the tree  ****
    // **** Left-Root-Right                ****
    void inOrderTraversal(TNode root){
        if (root==null) return;
        inOrderTraversal(root.leftChild);
        System.out.println(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }
}
