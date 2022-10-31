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
}