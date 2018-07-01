<<<<<<< HEAD
// Java program for implementation of Insertion Sort
import java.util.*;
class InsertionSort
{
    void insertionSort(int arr[])
    {
        Scanner sc=new Scanner(System.in);
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter element "+(i+1)+":");
            arr[i]=sc.nextInt();
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }

    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        InsertionSort ob = new InsertionSort();
        int arr[]=new int[5];
        ob.insertionSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
=======
// Java program for implementation of Insertion Sort
import java.util.*;
class InsertionSort
{
    void insertionSort(int arr[])
    {
        Scanner sc=new Scanner(System.in);
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter element "+(i+1)+":");
            arr[i]=sc.nextInt();
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }

    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        InsertionSort ob = new InsertionSort();
        int arr[]=new int[5];
        ob.insertionSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
>>>>>>> 92d5eaa8a637acf83e88dc217a03ac3a5c2fc2d4
}