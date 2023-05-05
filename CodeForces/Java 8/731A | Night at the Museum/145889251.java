import java.util.Scanner;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  String str = input.next();
  char refrence = 'a';
  int counter = 0 ;
  for(int i = 0 ; i < str.length();i++){
   if(Math.abs(refrence - str.charAt(i))>13)
   counter += 26-Math.abs(refrence - str.charAt(i));
   else 
     counter += Math.abs(refrence - str.charAt(i));
     refrence = str.charAt(i);
 
   
  }
  System.out.println(counter);
 }
}