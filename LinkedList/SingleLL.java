class Node{
    Object data;
    Node next;
    Node(Object data){
        this.data = data;
        this.next = null;
    }
}
class SingleLinkedList{
    Node head;
    SingleLinkedList(){
        this.head = null;
    }
    public void insertNode(Object data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }
        else{
            Node current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void printLinkedlist(){
        if (this.head == null) {
            System.out.println("there is nothing to print");
        } else {
            Node current = this.head;
            while(current.next != null){
                System.out.print(current.data);
                System.out.print("--->");
                current = current.next;
            }
            System.out.print(current.data);
            System.out.println("--->Null");
        }
    }

    public void multiInsert(Object[] arr){
        for (Object object : arr) {
            this.insertNode(object);
        }
    }
    public void deleteFirstNode(){
        if (this.head == null) {
            System.out.println("there ia no first node to delete");
        } else {
            Node current = this.head;
            this.head = current.next;
        }
    }
    public void deleteLastNode(){
        Node current = this.head;
        Node prev = null;
        if (this.head == null) {
            System.out.println("there is nothing to delete");
        } else if(this.head.next == null){
            this.head = null;
        }
        else{
            while(current.next != null){
                prev = current;
                current = current.next;
            }
            prev.next = null;
        }

    }
}
public class SingleLL {
    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        sl.insertNode(5);
        sl.printLinkedlist();
        sl.insertNode(2);
        sl.printLinkedlist();
        sl.deleteFirstNode();
        sl.printLinkedlist();
        sl.deleteLastNode();
        sl.printLinkedlist();
    }
}
