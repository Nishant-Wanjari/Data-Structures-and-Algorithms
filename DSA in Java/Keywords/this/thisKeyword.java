
class thisKeyword
{
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle(10,5);
        r1.display();
    }
}

class Rectangle
{
    int length;
    int breadth;

    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    
    void display()
    {
        System.out.println(this.length);
        System.out.println(this.breadth);
    }
    
    
}