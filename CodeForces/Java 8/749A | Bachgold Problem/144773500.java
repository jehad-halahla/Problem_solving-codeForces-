import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int x = input.nextInt();
  int count = x/2;
   System.out.println(count);
  for(int i=0 ; i < count -1;i++ ){
   System.out.print("" + 2 + " ");
   
  }
  if(x%2==0)
   System.out.print("" + 2 );
  else
   System.out.print("" + 3 );
 }
}