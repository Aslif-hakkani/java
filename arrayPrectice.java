import java.util.Scanner;
public class arrayPrectice
{
    private int[] arr;
    private int size;

    public arrayPrectice(int size)
    {
        this.size = size;
        this.arr = new int[size];
    }

    public void addElement()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< size; i++)
        {
            System.out.print("Enter the " + i +" element in array: ");
            arr[i] = sc.nextInt();
        }
    }

    public void displayElements()
    {
        System.out.print("Array elements are: ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }

    public void findMinimum()
    {
        int min = arr[0];
        for(int i=1; i<size; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("Minimum element is: " + min);
    }

    


    //main
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size is : ");
        int A = sc.nextInt();

        arrayPrectice array = new arrayPrectice(A);
        array.addElement();
        array.displayElements();
        array.findMinimum();
    }
}