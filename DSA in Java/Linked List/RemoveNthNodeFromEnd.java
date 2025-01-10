

public class RemoveNthNodeFromEnd
{
    public static void main(String[] args) {
        RemoveNthNodeFromEnd obj = new RemoveNthNodeFromEnd();
        obj.addFirst(10);
        obj.addFirst(20);
        obj.addFirst(30);
        obj.addFirst(40);
        obj.addFirst(50);
        obj.print();

        obj.deleteNthFromEnd(3);
        obj.print();
    }

    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
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
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(" Null");
    }



    public void deleteNthFromEnd(int nth)
    {
        int size = 0;
        Node temp = head;

        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }
        
        if(nth == size)
        {
            head = head.next;
            return;
        }
        
        int i = 1;
        Node prev = head;
        int iToRemove = size - nth;
        
        while(i < iToRemove)
        {
            prev= prev.next;
            i++;        }
        prev.next = prev.next.next;
        return;
    }

}