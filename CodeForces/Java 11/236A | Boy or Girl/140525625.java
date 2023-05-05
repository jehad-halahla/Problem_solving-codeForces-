import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 String str = input.next();
 
 int counter = 1;
 String already = ""+(char)str.charAt(0); 
 StringBuilder str1 = new StringBuilder(already);
 char [] array = str.toCharArray();
 for (int i = 1; i < array.length; i++) {
  if(str1.indexOf(""+array[i])==-1)
   counter++;
  str1.append(array[i]);
 
 }
 if(counter%2==0) {
  System.out.println("CHAT WITH HER!");
 }
 else
  System.out.println("IGNORE HIM!");
 }
}