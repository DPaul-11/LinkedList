package LinkedList;

public class LL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }

     public void addFirst(String data){
        Node new_Node=new Node(data);
        if(head==null){
            head=new_Node;
            return;
        }
        new_Node.next=head;
        head=new_Node;
     }

     public void addLast(String data){
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

    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.display();
        list.addLast("list");
        list.display();
        list.addFirst("This");
        list.display();
    }

}
