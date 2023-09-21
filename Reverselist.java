package LinkedList;
import java.util.*;
public class Reverselist {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(int data){
        Node new_Node=new Node(data);
        if(head==null){
            head=new_Node;
            return;
        }
        new_Node.next=head;
        head=new_Node;
    }

    public void addLast(int data){
        Node new_Node=new Node(data);
        if(head==null){
            head=new_Node;
            return;
        }
        Node curr_Node=head;
        while(curr_Node.next!=null){
            curr_Node=curr_Node.next;
        }
        curr_Node.next=new_Node;
    }

    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node curr_Node=head;
        while(curr_Node!=null){
            System.out.print(curr_Node.data+" -> ");
            curr_Node=curr_Node.next;
        }
        System.out.println("NULL");

    }

    public void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node prev=head;
        Node curr_Node=head.next;
        while(curr_Node!=null){
            Node next_Node=curr_Node.next;
            curr_Node.next=prev;

            prev=curr_Node;
            curr_Node=next_Node;
        }
        head.next=null;
        head=prev;
    }

    public static void main(String args[]){

        Reverselist list=new Reverselist();
        list.addFirst(3);
        list.addFirst(5);
        list.display();
        list.addLast(2);
        list.display();
        list.addFirst(7);
        list.display();
        list.reverse();
        list.display();
    }
}