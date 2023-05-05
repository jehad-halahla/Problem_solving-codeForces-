import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  String str =input.next();
  boolean isGood = false;
  for(int i = 0 ; i < 5 ; i++){
   String str1 = input.next();
   if(str.charAt(0)==str1.charAt(0)||str.charAt(1)==str1.charAt(1)){
    isGood = true;
    break;
   }
  }
  if(isGood)
   System.out.println("YES");
  else
   System.out.println("NO");
 
 }
}