import java.util.Scanner;
 
public class Test {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int num = input.nextInt();
  int counter = input.nextInt();
  for (int i = 0; i < counter; i++) {
   if (num % 10 != 0)
    num--;
   else
    num /= 10;
 
  }
  System.out.println(num);
 }
}