public class Palindrome_LinkedList 
{
    public static void main(String[] args) 
    {
        Palindrome_LinkedList obj = new Palindrome_LinkedList();  
        obj.addFirst(40);  
        obj.addFirst(30);  
        obj.addFirst(40);  
        // obj.addFirst(40);  
        obj.print();    

        System.out.println(obj.isPalindrome());

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
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(" Null");
    }

    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow; // Returns Middle  Node
    }

    public boolean isPalindrome()
    {
        if(head== null || head.next == null)
            {
                return true;
            }
        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while(right!=null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left =left.next;
            right = right.next;
        }
        return true;
    }
}
