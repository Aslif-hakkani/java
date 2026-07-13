/*
Implement a program that finds the intersection of two ArrayLists of integers. 
The program should take two ArrayLists as input and return a new ArrayList that contains 
only the common elements between the two input ArrayLists.
*/

import java.util.ArrayList;

public class ArrayList_Labsheet4
{
	public static void main(String [] args)
	{
		ArrayList<Integer>arr1 = new ArrayList<>();
		ArrayList<Integer>arr2 = new ArrayList<>();
		
		arr1.add(2);
		arr1.add(4);
		arr1.add(5);
		arr1.add(8);
		arr1.add(10);
		
		arr2.add(1);
		arr2.add(4);
		arr2.add(6);
		arr2.add(8);
		arr2.add(10);
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		ArrayList<Integer>intersection = new ArrayList<>();
		
		for (int i = 0; i < arr1.size(); i++)
		{
			if(arr2.contains(arr1.get(i)) && !intersection.contains(arr1.get(i)) )
			{
				intersection.add(arr1.get(i));
			}
		}
		
		
		System.out.println(intersection);
		
		
		
	}
}
