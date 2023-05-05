import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  int mishkaCounter = 0;
  int chrisCounter = 0;
  for(int i = 0 ; i < t ; i++){
   int x = input.nextInt();
   int y = input.nextInt();
   if(x>y)
    mishkaCounter++;
   else if(x<y)
    chrisCounter++;
  }
  if(mishkaCounter > chrisCounter)
   System.out.println("Mishka");
  else if(chrisCounter > mishkaCounter)
   System.out.println("Chris");
  else
   System.out.println("Friendship is magic!^^");
 }
}