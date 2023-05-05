import java.util.*;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for (int i = 0; i < t; i++) {
   int x = input.nextInt();
   int counter = 0;
   int[] a = new int[("" + x).length()];
   int y = x;
   for (int j = 0; j < a.length; j++) {
    a[j] = (int) (y % 10 * Math.pow(10, j));
    y /= 10;
    if (a[j] != 0) {
     counter++;
    }
   }
   System.out.println(counter);
   for (int j = 0; j < a.length; j++) {
    if (a[j] != 0) {
     if (j != a.length - 1)
      System.out.print(a[j] + " ");
     else
      System.out.print(a[j] + "\n");
 
    }
 
   }
 
  }
 }
}