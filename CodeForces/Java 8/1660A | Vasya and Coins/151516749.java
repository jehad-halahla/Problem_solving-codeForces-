import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
  int a = input.nextInt();
  int b = input.nextInt();
  if(a  < 1 )
  System.out.println(1);
  else
  System.out.println(a + (2*b) + 1);
 
  }
 }
}