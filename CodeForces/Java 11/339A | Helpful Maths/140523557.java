import java.util.Arrays;
import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 String str = input.next();
 String [] str1 = str.split("\\+");
 Arrays.sort(str1);
 for (int i = 0; i < str1.length; i++) {
  if(i == str1.length-1)
   System.out.println(str1[i]);
  else
  System.out.print(str1[i]+ "+" );
  
 }
 
  
 }
}