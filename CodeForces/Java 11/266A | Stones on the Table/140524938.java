import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int x = input.nextInt();
 String str = input.next();
 int counter = 0;
 char [] array = str.toCharArray();
 for (int i = 1; i < array.length; i++) {
  if(array[i] == array[i-1])
   counter++;
 }
 System.out.println(counter);
 }
}