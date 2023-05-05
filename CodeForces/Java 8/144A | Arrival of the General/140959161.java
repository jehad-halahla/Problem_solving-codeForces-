import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int t = in.nextInt();
  int[] a = new int[t];
  int maxi = 0;
  int mini = 0;
  for (int i = 0; i < t; i++) {
   a[i] = in.nextInt();
  }
  int min = a[0];
  int max = a[0];
  for (int i = 1; i < t; i++) {
   if (a[i] > max) {
    maxi = i;
    max = a[i];
   } else if (a[i] <= min) {
    mini = i;
    min = a[i];
   }
  }
 
  if (maxi < mini)
   System.out.println(maxi + (t - 1) - mini);
  else
   System.out.println(maxi + (t - 1) - mini - 1);
  in.close();
 }
}