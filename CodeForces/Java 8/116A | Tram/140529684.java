import java.util.Scanner;
 
public class Test {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int[] array = new int[input.nextInt() * 2];
 
  for (int i = 0; i < array.length; i++) {
   if (i % 2 == 0)
    array[i] = -input.nextInt();
   else
    array[i] = input.nextInt();
 
  }
  int max = array[0];
 
  int sum = 0;
  for (int i = 1; i < array.length - 1; i++) {
   sum += array[i];
   if (sum > max) {
    max = sum;
   }
  }
  System.out.println(max);
 }
}