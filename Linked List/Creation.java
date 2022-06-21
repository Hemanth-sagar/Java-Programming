public class LL {
    Node head;
    Node tail;
    int size;
    LL(){
        this.size = 0;
    }
    class Node {
        String data;
        Node next;

        Node (String data){
            this.data=data;
            this.next=null;
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
        size += 1;
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

    public static void main(String[] args) {
        //insert display delete size
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("three");
        list.printList();
        System.out.print("List size : " + list.size);
    }
}
