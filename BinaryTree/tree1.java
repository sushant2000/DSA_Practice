import java.util.Scanner;
public class solution{
    public static Scanner scn = new Scanner(System.in)

    public static class Node{
        int data = 0;
        Node left = null;
        Node right = null;
    }
    Node(int data , Node left , Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    private static void preOrderTraversal(Node root , ArrayList<Integer> ans){
        if(root.data == null) return;

        ans.add(root.data);
        preOrderTraversal(root.left , ans);
        preOrderTraversal(root.right , ans);
    }
    
    private static void inOrderTraversal(Node root , ArrayList<Integer> ans){
        if(root.data == null) return;
        
        inOrderTraversal(root.left , ans);
        ans.add(root.data);
        ineOrderTraversal(root.right , ans);
    }

    private static void postOrderTraversal(Node root , ArrayList<Integer> ans){
        if(root.data == null) return;

        postOrderTraversal(root.left , ans);
        postOrderTraversal(root.right , ans);
        
        ans.add(root.data);
    }
    
    public static void main(String args[]){

        ArrayList<Integer> ans = new ArrayList<>();
        postOrderTraversal(root,ans);
        ineOrderTraversal(root,ans);
        postOrderTraversal(root,ans);

    }
}