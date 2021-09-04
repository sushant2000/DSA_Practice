import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public static class bst{
    public static Scanner scn = new Scanner(system.in)
    public static class Node{
       int data = 0;
       Node left = null;
       Node right = null;

       Node(int data , Node left , Node right){
           this.data = data;
           this.left = left;
           this.right = right;
       }

       public static int size(Node node){
           return node == null ? 0 : size(node.left)+ size(node,right) + 1;
       }

       public static int height(Node node){
           return node == null ? -1 : Math.max(height(Node.left) , height(Node.right)) + 1
       }    
       public static int maximum(Node node){
           if(node == null) return 0;
           while(node.right != null){
               node = node.right;

               return node.data;
           }
       }
        
       public static int maximum(Node node){
           if(node == null) return 0;
           while(node.left != null){
               node = node.left;

               return node.data;
           }
       }

       public static boolean find(Node node , int data){
           while(node != null){
               if(node.data == data) return true;
               else if (node.data < data) node = node.right;
               else node = node.left;
           }
           return false;
       }

       public static ArrayList<Node> nodeTOrootPath(Node node , int data){
           ArrayList<Node> list = new ArrayList<>();
           boolean flag = false;
           while(node ! = null){
               list.add(node);
               if(node.data == data){
                   flag = true;
                   break;
               }else if(node.data < data){
                   node = node.right;
               }else{
                   node = node.left;
               }
           }
               if(!flag) list.clear();
               Collections.reverse(list);
               return list;
       }


public static int lca (Node node , int d1 , int d2){
    int lca = -1;
    while(node != null){
        if(d1<node.data && d2 < node.data) node = node.left;
        else if(d1 >node.data  && d2 > node.data) node = node.right;
        else {
            lca = node.data;
            break;
    }
    }
    return lca;
}
    }
