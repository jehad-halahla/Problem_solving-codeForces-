import java.util.*;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for (int i = 0; i < t; i++) {
   boolean sus = false;
   int n = input.nextInt();
   char[] a = input.next().toCharArray();
   for (int j = 0; j < n; j++) {
    int counter = 0;
    for (int k = j + 1; k < n; k++) {
     if (a[j] != a[k]) {
      counter++;
     }
     if (a[j] == a[k] && counter != 0) {
      sus = true;
      break;
     }
    }
   }
   if (sus)
    System.out.println("NO");
   else
    System.out.println("YES");
 
  }
 }
}