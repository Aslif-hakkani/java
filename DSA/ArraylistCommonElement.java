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
