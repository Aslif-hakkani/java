import java.util.*;

public class ArraylistCommonElement
{
    public static ArrayList<Integer> findCommonElement(ArrayList<Integer> list1,ArrayList<Integer> list2 )
    {
        ArrayList<Integer> result = new ArrayList<>();

        for(int num : list1)
        {
            if(list2.contains(num))
            {
                result.add(num);
            }
        }

        return result;
    }

    public static void main (String [] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5) );
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5,6,7) );

        ArrayList<Integer> result = findCommonElement(list1 , list2);

        System.out.println(result);
    }

}


// user add the list 1 and  2

/*

import java.util.*;

public class ArrayListCommonElement
{
    public static ArrayList<Integer> findCommonElement(
            ArrayList<Integer> list1,
            ArrayList<Integer> list2)
    {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : list1)
        {
            if (list2.contains(num))
            {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter number of elements for List 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter List 1 elements:");
        for (int i = 0; i < n1; i++)
        {
            list1.add(sc.nextInt());
        }

        System.out.print("Enter number of elements for List 2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter List 2 elements:");
        for (int i = 0; i < n2; i++)
        {
            list2.add(sc.nextInt());
        }

        ArrayList<Integer> result = findCommonElement(list1, list2);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Common Elements: " + result);

        sc.close();
    }
}

*/
