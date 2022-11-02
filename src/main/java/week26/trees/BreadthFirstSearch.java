package week26.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class BreadthFirstSearch {
    public static boolean traverseBFS(TreeNode root, String searchFor) {
        // Store nodes in a queue
        Queue<TreeNode> queue = new ArrayDeque<>();
        // Keep track of which node you're current searching
        TreeNode current = root;
        queue.add(root);
        while(!queue.isEmpty()) {
            // Investigate next node on the queue
            current = queue.poll();
            // Check for match
            if (current.getData().equals(searchFor)) {
                return true;
            }
            // Add the children
            if(current.getChildren() != null) {
                queue.addAll(current.getChildren());
            }
        }
        // Queue is empty... no match found
        return false;
    }

    public static void main(String[] args) {
        TreeNode<String> rootNode = new TreeNode<>("1");
        TreeNode<String> firstNode = new TreeNode<>("8", rootNode);
        TreeNode<String> secondNode = new TreeNode<>("5", rootNode);
        TreeNode<String> thirdNode = new TreeNode<>("2", rootNode);

        TreeNode<String> fourthNode = new TreeNode<>("6", firstNode);
        TreeNode<String> fifthNode = new TreeNode<>("4", firstNode);
        TreeNode<String> sixthNode = new TreeNode<>("3", firstNode);

        TreeNode<String> seventhNode = new TreeNode<>("2", thirdNode);

        TreeNode<String> eigthNode = new TreeNode<>("10", fourthNode);
        TreeNode<String> ninthNode = new TreeNode<>("7", fourthNode);

        boolean found = traverseBFS(rootNode, "12");
        System.out.println("Found = " + found);

    }


}
