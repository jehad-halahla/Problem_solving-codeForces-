import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int height = input.nextInt();
  int width = 0;
  for (int i = 0; i < n; i++) {
   if (input.nextInt() > height)
    width += 2;
   else
    width += 1;
  }
  System.out.println(width);
 }
}