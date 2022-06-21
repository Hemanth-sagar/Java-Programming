//delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

/*1*/   Node temp;
        temp = head.next ;
        head = temp;
        size--;

/*2*/ //head = head.next;
    }



//delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast= head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }



//Driver code
public class Main {
    Node head;
    Node tail;
    int size;
    Main(){
        this.size = 0;
    }
    class Node {
        String data;
        Node next;

        Node (String data){
            this.data=data;
            this.next=null;
            size += 1;
        }
    }

    //add first last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }

    //print
    public void printList(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node currNode = head;
        while(currNode !=null){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

/*1*/   Node temp;
        temp = head.next ;
        head = temp;
        size--;

/*2*/ //head = head.next;
    }

    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast= head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public static void main(String[] args) {
        //insert display delete size
        Main list = new Main();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("three");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteFirst();
        list.printList();
        System.out.print("List size : " + list.size);


    }
}
