package LinkedList;

public class Circularlinkedlist {


        //Represents the node of list.
        public class Node{
            int data;
            Node next;
            public Node(int data)
            {
                this.data = data;
            }
        }
        public Node head = null;
        public Node tail = null;
        public void add(int data)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = newNode;
                tail = newNode;
                newNode.next = head;
            }
            else
            {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }

        public void display() {
            Node current = head;
            if(head == null) {
                System.out.println("List is empty");
            }
            else {
                System.out.println("Nodes of the circular linked list: ");
                do{
                    //Prints each node by incrementing pointer.
                    System.out.print(" "+ current.data);
                    current = current.next;
                }while(current != head);
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Circularlinkedlist ob = new Circularlinkedlist();
            ob.add(1);
            ob.add(2);
            ob.add(3);
            ob.add(4);
            ob.display();
        }

}
