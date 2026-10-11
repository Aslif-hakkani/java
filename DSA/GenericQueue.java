class Node<T>
{
    T data;
    Node<T> next;

    public Node(T data)
    {
        this.data = data;
        this.next = null;
    }
}

class QueueADT<T>
{
    Node<T> front;
    Node<T> rear;

    public QueueADT()
    {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty()
    {
        return front == null;
    }

    public void enqueue(T data)
    {
        Node<T> newNode = new Node<T>(data);

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
            Node<T> current = front;

            while(current != null)
            {
                System.out.print(current.data + " ");
                current = current.next;
            }

            System.out.println();
        }
    }
}

public class GenericQueue
{
    public static void main(String [] args)
    {
        QueueADT<Integer> Q1 = new QueueADT<Integer>();

        Q1.enqueue(10);
        Q1.enqueue(20);
        Q1.enqueue(30);

        System.out.println("Integer Queue:");
        Q1.display();

        Q1.peek();

        Q1.dequeue();

        System.out.println("After dequeue:");
        Q1.display();


        QueueADT<String> Q2 = new QueueADT<String>();

        Q2.enqueue("Apple");
        Q2.enqueue("Banana");
        Q2.enqueue("Orange");

        System.out.println("String Queue:");
        Q2.display();
    }
}
