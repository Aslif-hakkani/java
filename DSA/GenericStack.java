public class GenericStack<T>
{
    private static class Node<T>
    {
        T data;
        Node<T> next;

        Node(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> top;

    public GenericStack()
    {
        top = null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);

        newNode.next = top;
        top = newNode;
    }

    public T pop()
    {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return null;
        }

        T data = top.data;
        top = top.next;

        return data;
    }

    public T peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty!");
            return null;
        }

        return top.data;
    }
	
    public boolean isEmpty()
    {
        return top == null;
    }

    public void display()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        Node<T> current = top;

        System.out.print("Stack elements:");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        intStack.display();
		System.out.println();

        System.out.println("Top element: " + intStack.peek());
        System.out.println("Popped element: " + intStack.pop());
		intStack.display();
		
        System.out.println("\nTop element after pop: " + intStack.peek());
        System.out.println();
       
        GenericStack<String> stringStack = new GenericStack<>();

        stringStack.push("Apple");
        stringStack.push("Banana");
        stringStack.push("Orange");

        stringStack.display();

        System.out.println("\nTop element: " + stringStack.peek());
    }
}