 
import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int t = input.nextInt();
  String str = input.next();
  char[] array = str.toCharArray();
  for (int j = 0; j < t; j++)
   for (int i = 0; i < array.length - 1; i++) {
    if (array[i] == 'B' && array[i + 1] == 'G') {
     array[i] = 'G';
     array[i + 1] = 'B';
     i++;
 
    }
   }
 
  System.out.println(array);
 }
}