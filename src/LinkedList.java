public class LinkedList {
    public static void main(String[] args) {
           LinkList l= new LinkList();
          l.displayList();
          Node n= new Node(5);
          l.displayList();
          l.insertFirst(3);
          l.insertFirst(4);
          l.insertFirst(6);
          l.insertFirst(9);
          l.displayList();
          l.deleteFirst();
          l.displayList();
          l.find(4);


    }
}
class Node {
    int data;
    Node next;
    Node(int item) {
        this.data=item;
        this.next=null;
    }
    void displayNode() {
        System.out.println(this.data);
    }
}
class LinkList {
    private Node head;
    public void LinkList() {
        head = null;
    }
    public boolean isEmpty() {
          if(head ==null)
              return true;


        return false;
    }
    public void insertFirst(int i) {
        if (isEmpty()){
            Node NewNode = new Node(i);
            head=NewNode;
            return;
        }
        Node NewNode = new Node(i);
        NewNode.next = head;
        head =NewNode;

    }
    public Node deleteFirst() {
          if (isEmpty()) {
            System.out.println("LinkedList is empty cannot delete");
             return null;
          }
           Node firstNode;
           firstNode = head;
           if(firstNode.next !=null){
               head =firstNode.next;
           }
           firstNode.next=null;
           return firstNode;

    }
    public void displayList() {

         Node current;
         current =head;
         if (current==null){
             System.out.println("emply list");
             return;
         }
         while (current!=null){
             System.out.print(current.data + " " );
             current =current.next;
         }
        System.out.println();

    }
    public Node find(int key) {
        Node current =head;
        int i=1;

        while (current !=null){
            if (key==i){
                  return current;
            };
            current=current.next;
            i++;
        }
        System.out.println("Item not found");
        return null;

    }
    public void delete(int key) {
        if (key==1){
            deleteFirst();
            return;
        }
        int i=1;
        Node previous = head;
        Node current =head;

        while (current !=null){
            if (key==i){
                previous.next=current.next;
                System.out.println("Item deleted");
                return;
            }
            previous=current;
            current=current.next;
            i++;
        }
        System.out.println("Item not available to deletion");

    }
}