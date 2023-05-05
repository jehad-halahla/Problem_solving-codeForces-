 import java.util.Scanner;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  String a = input.next();
  String b = input.next();
  String result = "";
for(int i  = 0 ;  i < a.length() ; i ++){
 if(a.charAt(i) != b.charAt(i))
  result +="1";
 else
  result +="0";
 }
 System.out.println(result);
 }
}