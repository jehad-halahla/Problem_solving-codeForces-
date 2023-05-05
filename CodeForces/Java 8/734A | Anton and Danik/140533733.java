import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int D = 0;
  int A = 0;
  char[] array = input.next().toCharArray();
  for (int i = 0; i < array.length; i++) {
   if (array[i] == 'D')
    D++;
   else
    A++;
  }
  if (A > D)
   System.out.println("Anton");
  else if (A < D)
   System.out.println("Danik");
  else
   System.out.println("Friendship");
 
 }
}