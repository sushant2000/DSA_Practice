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
           }
               return node.data;
       }
        
 public static int minimum(Node node){
           if(node == null) return 0;
           while(node.left != null){
               node = node.left;
           }
               return node.data;
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

public static void printInRange(Node node int lr , int rr){
    if(node == null) return;

    printInRange(node.left ,lr, rr)

    if(node.data >= lr && node.data <= rr)
    System.out.print(node.data);

    printInRange(node.right , lr , rr);
}

public static node addNodeInbst(Node node , int data){
    if(node == null) return new node(data);

    if(Node.data < data) node.right = addNodeInbst(node.right , data);
    else
    node.left = addNodeInbst(node.left , data);
    return node;
  }

  public static node removeNodeInBst(Node node , int data){
      if(node == null) return null;
      if(node.data < data)
      node.right = removeNodeInBst(node.right , data);
      else if(node.data > data)
      node.left = removeNodeInBst(node.left , data);
      else{
          if(node.left == null || node.right == null)
          return node.left != null ? node.left : node.right;

          int minele = minimum(node.right);
          node.data = minele

          node.right = removeNodeInBst(node.right , minele);
      }
      return node;
}

public static void inOrder(Node node , ArrayList<Integer> list){
    if(node == null) return;
    inOrder(node.left , list);
    list.add(node.data);
    inOrder(node.right , list);
}

public static void targetSum(Node node , int tar){
    ArrayList<Integer> list = new ArrayList<>();
    inOrder(node,list);
    int i = 0 , j = list.size() - 1;
    while(i < j){
        int sum = list.get(i) + list.gey(j);
        if(sum < tar) i++;
        else if(sum > tar) j--;
        else{
            System.out.print(list.get(i) + " " + list.get(j));
            i++;
            j--;
        }
        return node;
    }
}


    }
