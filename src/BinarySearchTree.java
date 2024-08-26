import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}

public class BinarySearchTree {
    static Node root;

    public void  insertNode (int input){
        if(root == null){
          root = new Node(input);
        }
        else if(input< root.data){
            root.left = insertRecNode(input, root.left);
        }
        else if(input>root.data){
            root.right = insertRecNode(input, root.right);
        }
    }

    public Node insertRecNode(int input,Node currentNode){
        if(currentNode !=null && input < currentNode.data ){
           currentNode.left = insertRecNode(input,currentNode.left);
        }
        else if (currentNode != null && input > currentNode.data ){
            currentNode.right = insertRecNode(input, currentNode.right);
        }
        else {
            currentNode =  new Node(input);
        }
        return currentNode;
    }

    public static void traversals(Node root){
        if(root == null){
            System.out.println("Empty Tree");
        }
        else{
            System.out.println("");
            System.out.println("Inorder Traversal");
            inorderRec(root);
            System.out.println("");
            System.out.println("Preorder Traversal");
            preOrderRec(root);
            System.out.println("");
            System.out.println("Postorder Traversal");
            postOrderRec(root);
        }
    }
    public static void inorderRec(Node node){
        if(node.left != null){
            inorderRec(node.left);
        }
        System.out.print(node.data+" , ");
        if(node.right != null){
            inorderRec(node.right);
        }

    }

    public static void preOrderRec(Node node){
        System.out.print(node.data+" , ");
        if(node.left != null){
            preOrderRec(node.left);
        }
        if(node.right != null){
            preOrderRec(node.right);
        }

    }
    public static void postOrderRec(Node node){
        if(node.left != null){
            postOrderRec(node.left);
        }
        if(node.right != null){
            postOrderRec(node.right);
        }
        System.out.print(node.data+" , ");
    }




    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        List<Integer> list = Arrays.asList(8,7,12,15,2,5);

//        List<Integer> list = Arrays.asList(1,2,3,6,4,5);
        System.out.println("Before:");
        System.out.println(root);
        for(int i : list){
            tree.insertNode(i);
        }
        System.out.println("After: ");
        System.out.println(root);

        System.out.println("Traversals");
        traversals(root);

    }

}