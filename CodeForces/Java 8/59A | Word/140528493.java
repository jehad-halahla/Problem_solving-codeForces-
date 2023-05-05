import java.util.Scanner;
 
public class Test {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  String str = input.next();
  int smallCount = 0;
  int bigCount = 0;
 
  for (int i = 0; i < str.length(); i++) {
   if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
    smallCount++;
   else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
    bigCount++;
  }
  if (bigCount > smallCount)
   System.out.println(str.toUpperCase());
  else
   System.out.println(str.toLowerCase());
 }
}