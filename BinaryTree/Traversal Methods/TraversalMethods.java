

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;

public class TraversalMethods 
{
    public static void main(String[] args) 
    {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(8);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(1);
        root.left.right.left = new TreeNode(6); 
    


        System.out.println("In-order Traversal:");
        inOrderTraversal(root);
        System.out.println("\nPre-order Traversal:");
        preOrderTraversal(root);
        System.out.println("\nPost-order Traversal:");
        postOrderTraversal(root);
        System.out.println("\nLevel-order Traversal:");
        levelOrderTraversal(root);
    }


    public static void inOrderTraversal (TreeNode node)
    {

        // Refer BinaryTree.InOrder Traversal.png to Understand the flow of In-order Traversal
        if (node == null)
             return;
        
        inOrderTraversal(node.left);
        System.out.print(node.val +"->");
        inOrderTraversal(node.right);

    }

    public static void preOrderTraversal(TreeNode node)
    {
        if(node == null)
             return;
    
       System.out.print(node.val +"->");
       preOrderTraversal(node.left);
       preOrderTraversal(node.right);
    }

    public static void postOrderTraversal(TreeNode node)
    {
        if(node == null)
             return;
    
       postOrderTraversal(node.left);
       postOrderTraversal(node.right);
       System.out.print(node.val +"->");
    }

   public static void levelOrderTraversal(TreeNode root)
   {
       Queue<TreeNode> queue = new LinkedList<>();

       queue.add(root);

       while(!queue.isEmpty())

       {
          TreeNode currentNode = queue.poll();
           System.out.print(currentNode.val +"->");
           
           if(currentNode.left != null)
               queue.add(currentNode.left);
            
            if(currentNode.right != null)
                queue.add(currentNode.right);
       }
       
   }
    
}
