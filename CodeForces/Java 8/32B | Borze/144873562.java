import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
     String str = input.next();
  String res = "";
  for(int i = 0 ; i < str.length();i++){
   if(str.charAt(i) == '.'){
    res += "0";
   }
    
   else if(str.charAt(i) == '-' && str.charAt(i+1) == '.'){
    res += "1";
    i++;
   }
   else{
    res+= "2";
    i++;
   }
  }
  System.out.println(res);
 }
}