/*This is a Java Program to implement Insertion Sort on an integer array.
Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.
It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
However, advantages of Insertion Sort are that it is efficient for (quite) small data sets, adaptive for data sets that are already substantially sorted,
stable (i.e. does not change the relative order of elements with equal keys), In-place ( i.e. only requires a constant amount O(1) of additional memory space)
and online (i.e. can sort a list as it receives it).
Worst case performance : О(n2) comparisons, swaps
Best case performance : O(n) comparisons, O(1) swaps
Average case performance : О(n2) comparisons, swaps*/
/*
 * Java Program to Implement Insertion Sort
 */
import java.util.Scanner;
/* Class InsertionSort */
public class InsertionSort {
 /* Insertion Sort function */
 public static void sort(int arr[]) {
   int N = arr.length;
   int i, j, temp;
   for (i = 1; i < N; i++) {
    j = i;
    temp = arr[i];
    while (j > 0 && temp < arr[j - 1]) {
     arr[j] = arr[j - 1];
     j = j - 1;
    }
    arr[j] = temp;
   }
  }
  /* Main method */
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Insertion Sort Test\n");
  int n, i;
  /* Accept number of elements */
  System.out.println("Enter number of integer elements");
  n = scan.nextInt();
  /* Create integer array on n elements */
  int arr[] = new int[n];
  /* Accept elements */
  System.out.println("\nEnter " + n + " integer elements");
  for (i = 0; i < n; i++)
   arr[i] = scan.nextInt();
  /* Call method sort */
  sort(arr);
  /* Print sorted Array */
  System.out.println("\nElements after sorting ");
  for (i = 0; i < n; i++)
   System.out.print(arr[i] + " ");
  System.out.println();
 }
}