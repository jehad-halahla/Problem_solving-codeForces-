import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  String s = input.next();
  int[] a = charCounter(s);
  boolean pand = true;
  for (int i = 0; i < 26; i++)
   if (a[i] == 0) {
    pand = false;
    break;
   }
  if (pand)
   System.out.println("YES");
  else
   System.out.println("NO");
 }
 
 public static int[] charCounter(String name) {
  int[] counterPerChar = new int[26];
  for (int i = 0; i < counterPerChar.length; i++) {
   counterPerChar[i] = 0;// set initial values to 0
  }
  char[] nameArray = name.toLowerCase().toCharArray();
  for (char comparator = 'a'; comparator <= 'z'; comparator++)
   for (int i = 0; i < nameArray.length; i++) {
    if (nameArray[i] == comparator) {
     counterPerChar[(int) (comparator) - 97]++;
    }
   }
  return counterPerChar;
 }
 
}