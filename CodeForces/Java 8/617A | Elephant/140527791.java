import java.util.Scanner;
 
public class Test {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int distance = input.nextInt();
  int counter = 0;
  for (int i = 5; i > 0; i--) {
   if (distance < i) {
    
   } else {
    counter+=distance/i;
    distance=distance%i;
   }
  }
  System.out.println(counter);
 }
}