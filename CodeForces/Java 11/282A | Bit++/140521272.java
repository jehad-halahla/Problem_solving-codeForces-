 
import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int x = 0;
  int n = input.nextInt();
  for(int i = 0 ; i < n ; i++) {
   String str = input.next();
   
   if(str.contains("+"))
    x++;
   else 
    x--;
  }
  System.out.println(x);
 }
}