package week26.trees;

import java.util.Stack;

public class DepthFirstSearch {

    public static boolean traverseDFS(String searchFor, TreeNode root) {
        // Store nodes in a stack
        Stack<TreeNode> stack = new Stack<TreeNode>();

        // Keep track of which node you're current searching
        TreeNode current = root;
        stack.push(root);
        while(!stack.isEmpty()) {
            // Investigate next node on the stack
            current = stack.pop();
            // Check for match
            if (current.getData().equals(searchFor)) {
                return true;
            }
            // Add the children
            if(current.getChildren() != null) {
                stack.addAll(current.getChildren());
            }
        }
        // Stack is empty... no match found
        return false;
    }

    public static void main(String[] args) {
        TreeNode<String> rootNode = new TreeNode<>("0");
        TreeNode<String> firstNode = new TreeNode<>("1", rootNode);
        TreeNode<String> secondNode = new TreeNode<>("2", rootNode);

        TreeNode<String> thirdNode = new TreeNode<>("3", firstNode);
        TreeNode<String> fourthNode = new TreeNode<>("4", firstNode);
        TreeNode<String> fifthNode = new TreeNode<>("5", firstNode);
        TreeNode<String> sixthNode = new TreeNode<>("6", secondNode);

        boolean found = traverseDFS("2", rootNode);
        System.out.println("Found = " + found);

    }
}
