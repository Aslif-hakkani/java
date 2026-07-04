import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean prime = true;

        int A = sc.nextInt();
        
        if(A<=1)
        {
            prime = false;
        }

        for(int i=2; i<= Math.sqrt(A); i++)
        {
            if(A%i ==0)
            {
                prime = false;
                break;
            }
        }
        
        if(prime)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }


    }
}