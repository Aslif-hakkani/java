import java.util.Scanner;
public class Array
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array length is: ");
        int A = sc.nextInt();
        int [] arr = new int[A];
        for(int i=0; i<A; i++)
        {
            System.out.print("Enter the value for index " + i + " :");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are:");
        for(int i=0; i<A; i++)
        {
            System.out.print(arr[i] + " ");
        }

        int min = arr[0];
        for(int i =0; i<A; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("  ");
        System.out.println("Minimum value in the array is: " + min);

        //Write a program that reverses the order of elements in an integer array.

        System.out.print("Array elements in reverse order are: ");
        for(int j = A - 1; j >= 0; j--)
        {
            System.out.print(arr[j] + " ");
        }

        //Write a program that counts the frequency of each element in an integer array and prints the results.
        System.out.println("\nFrequency of each element:");
        boolean[] counted = new boolean[A];   // already print pannirukoma nu track pannurathukku
        for(int i = 0; i < A; i++)
        {
            if(counted[i]) continue;   // ithu already munnadi count panniyachu, so skip pannurom
            int count = 0;
            for(int j = 0; j < A; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }

        //Write a program that merges two sorted integer arrays into a single sorted array.
        System.out.println("\n--- Merge Two Sorted Arrays ---");
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] merged = new int[arr1.length + arr2.length];

        int p = 0, q = 0, k = 0;
        while(p < arr1.length && q < arr2.length)
        {
            if(arr1[p] <= arr2[q])
                merged[k++] = arr1[p++];
            else
                merged[k++] = arr2[q++];
        }
        // oru array mudinjadhum, matha array la migunthadhu direct copy pannurom
        while(p < arr1.length)
            merged[k++] = arr1[p++];
        while(q < arr2.length)
            merged[k++] = arr2[q++];

        System.out.print("Merged sorted array: ");
        for(int x : merged)
            System.out.print(x + " ");

        //Write a program that sorts the elements in an integer array in ascending order using bubble sorting algorithm.
        System.out.println("\n--- Bubble Sort ---");
        int[] bubbleArr = arr.clone();   // original array-a maatama copy vechu sort pannurom
        for(int i = 0; i < A - 1; i++)
        {
            for(int j = 0; j < A - 1 - i; j++)
            {
                if(bubbleArr[j] > bubbleArr[j+1])
                {
                    // adjacent elements swap pannurom
                    int temp = bubbleArr[j];
                    bubbleArr[j] = bubbleArr[j+1];
                    bubbleArr[j+1] = temp;
                }
            }
        }
        System.out.print("Bubble sorted array: ");
        for(int x : bubbleArr)
            System.out.print(x + " ");

        //Write a program that sorts the elements in an integer array in ascending order using selection sorting algorithm.
        System.out.println("\n--- Selection Sort ---");
        int[] selectionArr = arr.clone();
        for(int i = 0; i < A - 1; i++)
        {
            int minIndex = i;
            for(int j = i + 1; j < A; j++)
            {
                if(selectionArr[j] < selectionArr[minIndex])
                {
                    minIndex = j;
                }
            }
            // minimum element-a current position-ku kondu varom
            int temp = selectionArr[minIndex];
            selectionArr[minIndex] = selectionArr[i];
            selectionArr[i] = temp;
        }
        System.out.print("Selection sorted array: ");
        for(int x : selectionArr)
            System.out.print(x + " ");

        System.out.println();
    }
}