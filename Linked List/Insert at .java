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

    public void addAt(String val,int index){
        if(index == 0){
            addFirst(val);
            return;
        }
        if(index == size){
            addLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next=temp.next;
        temp.next=newNode;
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
        Main list = new Main();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("three");
        
        list.printList();
        System.out.println("List size : " + list.size);
        
        list.addAt("new",2);
        list.printList();
    }
}
