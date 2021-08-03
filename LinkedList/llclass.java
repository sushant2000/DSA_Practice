import java.util.Scanner;
public class linkedlist{
    private class Node{
        int data = 0;
        Node next = null;

        Node (int data){
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int sizeOfLL = 0;

    public boolean isEmpty(){
        return sizeOfLL == 0;
    }
    
    public int size(){
        return this.sizeOfLL;
    }
    
    //All three function of add
    private void addFirstNode(Node node){
        if(this.head==null){
            this.head = node;
            this.tail = node;
        }
        else{
            node.next = this.head;
            this.head = node;
        }
        this.sizeOfLL++;
    }
    public void addFirst(int data){
        Node node = new Node(data);
        addFirstNode(data);
    }

    private void addLastNode(Node node){
        if(this.head==null){
            this.head = node;
            this.tail = node;
        }else{
            this.tail.next = node;
            this.tail = node;
        }
        this.sizeOfLL++;
    }
    public void addLast( int data){
        Node node = new Node(data);
        addLastNode(node);
    }

    private void addAtNode(Node node , int idx){
        if(idx==0){
            addFirstNode(node);
        }else if(idx == this.sizeOfLL){
            addLastNode(node);
        }else{
            Node prev = getNodeAt(idx-1);
            Node forw = prev.next;

            prev.next = node;
            node.next = forw;
            this.sizeOfLL++;
        }
    }
    public void addAt(int data , int idx){
        Node node = new Node(data);
        addAtNode(node,idx);
    }

    // All three function of remove
    
    public void EmptyException throws Exception{
        if(this.sizeOfLL==0){
            throw new Exception("Linked List is empty");
        }
    }
    private Node removeFirstNode(){
        Node removeNode = this.head;
       if(this.sizeOfLL==1){
           this.head = null;
           this.tail = null;
       }else{
           Node forw = this.head.next;
           removeNode = null;
           this.head = forw;
       }
       this.sizeOfLL--;
       return removeNode;
    }
    public void removeFirst() throws Exception{
        EmptyException();
        Node node = removeFirstNode();
        return node.data;

    }

    private void removeLastNode(){
        Node removeNode = this.tail;
        if(this.sizeOfLL == 1){
            this.head = null;
            this.tail = null;
        }else{
            Node SecondLastNode = getNodeAt(this.sizeOfLL-2);
            this.tail = SecondLastNode;
            this.tail.next = null; 
        }
        this.sizeOfLL--;
        return removeNode;
    }
    public void removeLast(){
        EmptyException();
        Node node = removeLastNode();
        return node.data;
    }




    public static void main(String[] args){

    }
}