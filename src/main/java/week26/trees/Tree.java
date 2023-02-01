package week26.trees;


public class Tree {

    public static void main(String[] args) {

        TreeNode<String> rootNode = new TreeNode<>("Root");
        TreeNode<String> firstNode = new TreeNode<>("Child 1 (under Root)", rootNode);
        TreeNode<String> secondNode = new TreeNode<>("Child 2 (under Root)", rootNode);
        TreeNode<String> thirdNode = new TreeNode<>("Child 3 (under Child 2)", secondNode);
        TreeNode<String> fourthNode = new TreeNode<>("Child 4 (under Child 3)", thirdNode);
        TreeNode<String> fifthNode = new TreeNode<>("Child 5 (under Root, but with a later call)");
        fifthNode.setParent(rootNode);

        System.out.println(rootNode.toString());
        System.out.println(firstNode.toString());
        System.out.println(secondNode.toString());
        System.out.println(thirdNode.toString());
        System.out.println(fourthNode.toString());
        System.out.println(fifthNode.toString());

        System.out.println("Is rootNode a root node? - " + rootNode.isRootNode());
        System.out.println("Is firstNode a root node? - " + firstNode.isRootNode());
        System.out.println("Is thirdNode a leaf node? - " + thirdNode.isLeafNode());
        System.out.println("Is fifthNode a leaf node? - " + fifthNode.isLeafNode());
    }
}
