import java.util.*;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for (int i = 0; i < t; i++) {
   int n = input.nextInt();
   int[] a = new int[n];
   for (int j = 0; j < n; j++)
    a[j] = input.nextInt();
   if (a[0] != a[1] && a[1] == a[2]) {
    System.out.println(1);
 
   } else if (a[n - 1] != a[n - 2] && a[n - 2] == a[n - 3]) {
    System.out.println(n);
 
   } else {
    for (int j = 1; j < n - 1; j++) {
     if (a[j] != a[j - 1] && a[j] != a[j + 1]) {
      System.out.println(j + 1);
      break;
     }
    }
   }
 
  }
 }
}