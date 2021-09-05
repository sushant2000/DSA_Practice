import java.util.Scanner;
import java.util.ArrayList;
public class solution{
    public static class Node{
        int data = 0;
        ArrayList<Node> children = new ArrayList<>();

        Node(int data){
            this.data = data;
        }
    }

    public static int size(Node node){
        int sz = 0;
        for(Node child : Node.children){
        sz += size(child);
       }
        return sz + 1;
    }
    public static int height(Node node){
        int h = -1;
        for(Node child : Node.children){
        h = Math.max(h  height(child));
        }

        return h + 1;
    }

    public static int height(Node node){
        int h = 0; // in terms of Node
        for(Node child : Node.children){
        h = Math.max(h  height(child));
        }

        return h + 1;
    }

public static int Maximum(Node node){
        int max = node.data
        for(Node child : Node.children){
            max = Math.max(max , Maximum(child));
        }
        max = Math.max(max , );
    return max;
}

    
public static int Minimum(Node node){
        int min = node.data;
        for(Node child : Node.children){
            min = Math.min(min , Minimum(child));
        }
    return min;
    }

public static boolean find (Node node , int data){
    boolean res = node.data == data;
     for(Node child : node.children){
        res =  res || find(child,data);
     }
     return res;
}

public static ArrayList<Node> rootToNodePath(Node node , int data , ArrayList<Node> list){
    boolean res = node.data == data;
    for(Node child : node.children){
        res = res || find(child,data);
    }
    if(res) res.add(node);
    Collections.reverse(list);
    return list;

    //Another Approach
    public static ArrayList<Integer> rootToNodePath2(Node node , int data){
        if(node.data == data)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(node.data);
        return list;

        for(Node child : node.children){
            ArrayLlist<Integer> list2 = rootToNodePath2(child,data);

            if(list2.size() > 0) {
                list2.add(node.data); 
                return list2;
            }
        }
        return new ArrayList<>();

        }
    }
}




}