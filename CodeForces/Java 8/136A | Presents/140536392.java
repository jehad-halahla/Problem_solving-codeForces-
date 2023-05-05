import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int[] array = new int[n];
  int[] array1 = new int[n];
  for (int i = 0; i < array.length; i++) {
   array[i] = input.nextInt();
  }
  for (int j = 0; j < array.length; j++)
   for (int i = 0; i < array.length; i++) {
    if (array[i] == (j + 1)) {
     array1[j] = (i + 1);
    }
   }
  for (int i = 0; i < array.length; i++) {
   if (i != array.length - 1)
    System.out.print(array1[i] + " ");
   else
    System.out.println(array1[i]);
  }
 }
}