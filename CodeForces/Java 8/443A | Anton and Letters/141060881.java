import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int counter = 0; 
  StringBuilder s = new StringBuilder(in.nextLine());
  for (int i = 0; i < s.length(); i++) {
   if (!(s.charAt(i) <= 'z' && s.charAt(i) >= 'a')) {
    s.deleteCharAt(i);
    i--;
   }
   
 
  }
  int[] ar = charCounter(s.toString());
  for (int i = 0; i < ar.length; i++) {
   if(ar[i]!= 0 ) {
    counter++;
    }
   }
  System.out.println(counter);
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