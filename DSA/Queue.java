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

class QueueADT
{
    Node front;
    Node rear;

    public QueueADT()
    {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty()
    {
        return front == null;
    }

    public void enqueue(int data)
    {
        Node newNode = new Node(data);

        if(isEmpty())
        {
            front = newNode;
            rear = newNode;
        }
        else
        {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Deleted element = " + front.data);
            front = front.next;

            if(front == null)
            {
                rear = null;
            }
        }
    }

    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Front element = " + front.data);
        }
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            Node current = front;

            while(current != null)
            {
                System.out.print(current.data + " ");
                current = current.next;
            }

            System.out.println();
        }
    }
}

public class Queue
{
    public static void main(String [] args)
    {
        QueueADT Q1 = new QueueADT();

        Q1.enqueue(10);
        Q1.enqueue(20);
        Q1.enqueue(30);

        System.out.println("Queue elements:");
        Q1.display();

        Q1.peek();

        Q1.dequeue();

        System.out.println("After dequeue:");
        Q1.display();

        Q1.peek();
    }
}
