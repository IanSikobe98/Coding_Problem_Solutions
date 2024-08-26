import java.util.ArrayList;
import java.util.List;

// * Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class InorderSolution {

    List<Integer>  finalList= new ArrayList();


    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){

        }
        else{
            inOrder(root);
        }
        return finalList;
    }
    public void inOrder(TreeNode root){
        if(root.left!=null){
            inorderTraversal(root.left);
        }
        finalList.add(root.val);
        if(root.right!=null){
            inorderTraversal(root.right);
        }
    }
}