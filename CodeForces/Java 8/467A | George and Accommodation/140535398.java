import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int counter = 0;
  int[] array = new int[n * 2];
  for (int i = 0; i < array.length; i++) {
   if (i % 2 == 0)
    array[i] = -input.nextInt();
   else
    array[i] = input.nextInt();
  }
  for (int i = 0; i < array.length - 1; i += 2) {
   if (array[i] + array[i + 1] > 1)
    counter++;
  }
  System.out.println(counter);
 
 }
}