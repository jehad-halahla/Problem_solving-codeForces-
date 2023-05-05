import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ;i++){
   int n = input.nextInt();
   int o = input.nextInt();
   StringBuilder str = new StringBuilder(input.next());
   String str1 = str.toString();
   String str2 = str.reverse().toString();
   if(o <1 || str1.equals(str2)){
    System.out.println(1);
   }
   else{
    System.out.println(2);
 
   }
   
  }
 }
}