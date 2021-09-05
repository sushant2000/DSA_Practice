import java.util.Scanner;
import java.util.ArrayList;
public class solution{
    public static class Node{
        int data = 0;
        ArrayList<Node> children = new ArrayList<>();
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
}