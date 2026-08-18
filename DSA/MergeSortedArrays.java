/*
import java.util.*;

public class MergeSortedArrays
{
    public static ArrayList<Integer> MergeArray (ArrayList<Integer>list1 , ArrayList<Integer>list2)
    {
        ArrayList<Integer> result = new ArrayList<>();

        result.addAll(list1);
        result.addAll(list2);

        Collections.sort(result);

        return result;
    }

    public static void main(String [] args)
    {
        ArrayList<Integer> list1 = new ArrayList<> (Arrays.asList(1,4,2,8,6) );
        ArrayList<Integer> list2 = new ArrayList<> (Arrays.asList(10,7,5,3) );

        ArrayList<Integer> result = MergeArray(list1 , list2);

        System.out.println("Ascending Array: " + list1);
        System.out.println("Descending Array: " + list2);
        System.out.println("Merged Sorted Array: " + result);
    }
}
*/

// user add the list 1 and  2


import java.util.*;

public class MergeSortedArrays
{
    public static ArrayList<Integer> mergeArrays(
            ArrayList<Integer> list1,
            ArrayList<Integer> list2)
    {
        ArrayList<Integer> result = new ArrayList<>();

        result.addAll(list1);
        result.addAll(list2);

        Collections.sort(result);

        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter number of elements for ascending array: ");
        int n1 = sc.nextInt();

        System.out.println("Enter ascending ordered elements:");
        for (int i = 0; i < n1; i++)
        {
            list1.add(sc.nextInt());
        }

        System.out.print("Enter number of elements for descending array: ");
        int n2 = sc.nextInt();

        System.out.println("Enter descending ordered elements:");
        for (int i = 0; i < n2; i++)
        {
            list2.add(sc.nextInt());
        }

        ArrayList<Integer> result = mergeArrays(list1, list2);

        System.out.println("Ascending Array: " + list1);
        System.out.println("Descending Array: " + list2);
        System.out.println("Merged Sorted Array: " + result);

        sc.close();
    }
}

