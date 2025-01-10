public class Reverse_LinkedList {
    public static void main(String[] args) {
        Reverse_LinkedList llObj = new Reverse_LinkedList();
        llObj.addFirst(10);
        llObj.addFirst(20);
        llObj.addFirst(30);
        llObj.addFirst(40);
        llObj.print();
        llObj.reverseLL();
        llObj.print();
    }

    public static class Node
    {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    
    public void addFirst(int data)
    {
        Node newNode = new Node(data);

        if(head==null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print()
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
