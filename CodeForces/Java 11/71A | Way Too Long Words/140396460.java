import java.util.Scanner;
 
public class Watermelon {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  String[] array = new String[n];
  for (int i = 0; i < n; i++) {
 
   String word = input.next();
   if (word.length() > 10)
    array[i] = "" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1);
   else
    array[i] = word;
  }
 
  for (int i = 0; i < n; i++) {
   System.out.println(array[i]);
  }
 }
}