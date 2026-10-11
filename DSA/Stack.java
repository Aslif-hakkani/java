class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class StackADT
{
    Node top;

    public StackADT()
    {
        this.top = null;
    }
    
    public boolean isEmpty()
    {
        return top == null;
    }

    public void push( int data)
    {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
    }
    public void pop()
    {
        if( isEmpty() )
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Deleted element = " + top.data);
            top = top.next;
        }
    }
    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Top element = " + top.data);
        }
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            Node current = top;

            while(current != null)
            {
                System.out.print(current.data + " ");
                current = current.next;
            }

            System.out.println();
        }
    }

}

public class Stack
{
    public static void main(String [] args)
    {
        StackADT S1 = new StackADT();

        S1.push(10);
        S1.push(20);
        S1.push(30);

        System.out.println("Stack elements:");
        S1.display();

        S1.peek();

        S1.pop();

        System.out.println("After pop:");
        S1.display();

        S1.peek();
    }
}