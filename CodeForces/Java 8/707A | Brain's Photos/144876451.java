import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int x = input.nextInt();
  int y = input.nextInt();
  boolean isColored = false;
  for(int i = 0 ; i < x*y ; i++){
   String str = input.next();
   if (!(str.equals("W") || str.equals("B") || str.equals("G"))){
    
    isColored = true;
    break;
   }
  }
  if(isColored)
  System.out.println("#Color");
 else
     System.out.println("#Black&White");
 
 }
}