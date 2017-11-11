/*This is a java program to sort the numbers using the Bubble Sort Technique.
The algorithm goes with the name, generally used to sort numbers in the ascending order.
The smallest numbers bubbles up at each iteration of the sort. The time complexity of the algorithm is O(n^2).*/
//This is a java program to sort numbers using bubble sort
import java.util.Random;
public class Bubble_Sort {
 static int[] sort(int[] sequence) {
  // Bubble Sort
  for (int i = 0; i < sequence.length; i++)
   for (int j = 0; j < sequence.length - 1; j++)
    if (sequence[j] > sequence[j + 1]) {
     sequence[j] = sequence[j] + sequence[j + 1];
     sequence[j + 1] = sequence[j] - sequence[j + 1];
     sequence[j] = sequence[j] - sequence[j + 1];
    }
  return sequence;
 }
 static void printSequence(int[] sorted_sequence) {
  for (int i = 0; i < sorted_sequence.length; i++)
   System.out.print(sorted_sequence[i] + " ");
 }
 public static void main(String args[]) {
  System.out.println("Sorting of randomly generated numbers using BUBBLE SORT");
  Random random = new Random();
  int N = 20;
  int[] sequence = new int[N];
  for (int i = 0; i < N; i++)
   sequence[i] = Math.abs(random.nextInt(1000));
  System.out.println("\nOriginal Sequence: ");
  printSequence(sequence);
  System.out.println("\nSorted Sequence: ");
  printSequence(sort(sequence));
 }
}