package LinkedList;
import java.util.*;
public class Insertelements {

    static Node head;
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int pos, int data){
        Node new_Node=new Node(data);
        if(pos==1){
            new_Node.next=head;
            head=new_Node;
        }
        else{
            Node prev=head;
            int count=1;
            while(count<pos-1){
                prev=prev.next;
                count++;
            }
            Node curr_Node=prev.next;
            prev.next=new_Node;
            new_Node.next=curr_Node;
        }
    }

    public static void printList()
    {
        Node currNode = head;

        while (currNode != null)
        {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        Insertelements list = new Insertelements();

        list.insert(1,3);
        list.insert(2,5);
        list.insert(3,6);
        list.insert(4,8);
        printList();
        list.insert(2,7);
        printList();
    }
}