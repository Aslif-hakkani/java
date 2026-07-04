import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        
        if(A%2 == 0)
        {
            System.out.println("THis is Even number");
        }
        else
        {
            System.out.println("This is odd number");
        }
    }
}