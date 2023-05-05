import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for (int i = 0; i < t; i++) {
   String yes = input.next();
   if ((yes.charAt(0) == 'y' || yes.charAt(0) == 'Y') && (yes.charAt(1) == 'e' || yes.charAt(1) == 'E')
     && (yes.charAt(2) == 's' || yes.charAt(2) == 'S'))
    System.out.println("YES");
   else
    System.out.println("NO");
  }
 }
}