import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
  int n =input.nextInt();
  int x = n/3;
  int y=x;
  if(n%3 == 1 )
   x++;
  else if (n%3 == 2)
   y++;
  System.out.println(x + " " + y);
  }
 }
}