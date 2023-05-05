 
import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  StringBuilder str = new StringBuilder(input.next());
  StringBuilder str1 = new StringBuilder(input.next());
  String string = str1.toString();
  String reverse = str.reverse().toString();
  if (reverse.equals(string))
   System.out.println("YES");
  else
   System.out.println("NO");
 }
}