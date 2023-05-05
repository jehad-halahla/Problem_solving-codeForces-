 
import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  String str = input.next();
  str = str.replaceAll("[^47]", "");
  if(str.length()==4 || str.length()==7) 
  System.out.println("YES");
  else
   System.out.println("NO");
 }
}