import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int p = input.nextInt();
  ArrayList<Integer> arr1 = new ArrayList<Integer>();
  for (int i = 0; i < p; i++) {
   arr1.add(input.nextInt());
  }
  int q = input.nextInt();
  for (int i = 0; i < q; i++) {
   arr1.add(input.nextInt());
  }
  boolean canComplete = true;
  for (int i = 1; i <= n; i++) {
   if (!arr1.contains(i)) {
    canComplete = false;
    break;
   }
  }
  if (canComplete)
   System.out.println("I become the guy.");
  else
   System.out.println("Oh, my keyboard!");
 
 }
 
}