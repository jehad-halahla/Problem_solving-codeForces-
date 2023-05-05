import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
 
  for (int i = n + 1; i <= 9012; i++) {
   int x1 = i % 10;
   int x2 = (i / 10) % 10;
   int x3 = (i / 100) % 10;
   int x4 = (i / 1000) % 10;
   if (x1 != x2 && x1 != x3 && x1 != x4 && x2 != x3 && x2 != x4 && x3 != x4) {
    System.out.println(i);
    break;
   }
  }
 }
}