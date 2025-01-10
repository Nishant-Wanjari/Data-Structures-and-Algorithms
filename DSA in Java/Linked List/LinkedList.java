public class LinkedList 
{
    public static void main(String args[])
    {
       LinkedList llObj = new LinkedList();
       llObj.print();
       llObj.addFirst(2);
       llObj.print();
       llObj.addFirst(1);
       llObj.print();
       llObj.addLast(3);
       llObj.print();
       llObj.addLast(4);
       llObj.print();
       llObj.addAtIndex(2,9);
       llObj.print();
       llObj.addAtIndex(0,10);
       llObj.print();
       
       llObj.removeFirst();
       llObj.print();
       llObj.removeLast();
       llObj.print();
       System.out.println("LinkedList Size : "+LinkedList.size);
       llObj.iterativeSearch(9);
       System.out.println(llObj.iterativeSearch(9));
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
    public static int size;

    public void addFirst(int data)
    {   
        Node newNode = new Node(data);
        size++;
        if (head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if (head == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void print()
    {
        Node temp = head;
        if (head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        
        
        while (temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }

    public void addAtIndex(int index, int data)
    {
        if(index == 0)
        {
            addFirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i<index-1)
        {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst()
    {
        if(size==0)
        {
            System.out.println("List is Empty");
            return;
        }
        else if(size==1)
        {
        
            head = tail = null;
            size =0;
            return;
            
        }
        
        head = head.next;
        size--;
    }

    public void removeLast()
    {
        if(size==0)
        {
            System.out.println("List Empty");
        }
        else if(size==1)
        {
            head = tail = null;
            size=0;
            return;
        }
        Node temp = head;
        for (int i = 0;i<size-2;i++)
        {
            temp = temp.next;
        }
        temp.next =null;
        temp = tail;
        size--;
    }

    public int iterativeSearch(int key)
    {
        Node temp = head;
        if (head==null)
        {
            System.out.println("List Empty ");
            return Integer.MIN_VALUE;
        }
        for (int i = 0 ; i < size; i ++)
        {
            if (temp.data == key)
            {
                System.out.println("Key Found at "+ i +"th position");
                return i;
            }
            temp = temp.next;
        }

        return -1;
    }
    public int iterativeSearchWhileLoop(int key)
    {
        Node temp = head;
        if (head==null)
        {
            System.out.println("List Empty ");
            return Integer.MIN_VALUE;
        }
        int i =0 ;
        while(temp!=null)
        {
            if(temp.data ==key)
            {
                return i;
            }

            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helperFunction(Node head, int key)
    {
        if(head==null)
        {
            return -1;
        }

        if(head.data ==key)
        {
            return 0;
        }
        int index = helperFunction(head.next,key);
        if(index ==-1)
        {
            return -1;
        }
        return index + 1 ;
    }

    public int recursiveSearch(int key)
    {
        return helperFunction(head, key);
    }
}
