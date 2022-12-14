public class TreeApp {

    public static void main(String[] args) {

        MyTree tree = new MyTree();
       // int[] numbers = new int[] {10,5,12,3,6,11,13,2};
        int[] numbers = new int[] {10,6,8,20,4,9,5,17,42,47,29};
        for (int i = 0; i < 11; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root, null,false);

//        tree.preOrderTraversal(tree.root);
//        System.out.println("- Pre Order Traversal");
//
//        tree.inOrderTraversal(tree.root);
//        System.out.println("- In Order Traversal");
//
//        tree.postOrderTraversal(tree.root);
//        System.out.println("- Post Order Traversal");
//
//        tree.levelOrderTraversal();
//        System.out.println("- Level Order Traversal");

        System.out.print(tree.contains(8));
        System.out.print("- public boolean contains");

        System.out.println();
        tree.printLeaves(tree.root);
        System.out.println("-printLeaves");

        System.out.println("Number of leaves: "+tree.countLeaves(tree.root));
        System.out.println("Sum of Leaf Nodes: "+tree.findSumOfLeaves(tree.root));
        System.out.println("Height of the tree is: "+tree.height(tree.root));
        //********************************************

        System.out.println("Sum of Node Depths is: "+tree.calculateNodeDepthSums());
       System.out.println("Sum of All node values is: "+tree.calculateNodeSums());
    }

}
