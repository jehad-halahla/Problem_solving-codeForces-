import java.util.*;
public class Main{
 public static void main(String []args){
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  for(int i=0 ;i < n ; i ++ ){
   String str = input.next();
   String string = ""+str.charAt(0);
   for(int j = 1 ; j<str.length();j+=2){
   string = string+str.charAt(j);
    }
    System.out.println(string);
   }
  }
 }