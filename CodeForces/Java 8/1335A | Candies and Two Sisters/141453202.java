import java.util.Scanner;
import java.util.Collections;
public class Main{
 public static void main(String [] args){
  Scanner in = new Scanner(System.in);
  int t = in.nextInt();
  for(int i = 0 ; i < t ; i++){
   int x  = in.nextInt();
   if(x%2==0 && x!=0){
    System.out.println((x/2)-1);
   }
   else if(x==0){
    System.out.println(0);
   }
   else
    System.out.println(x/2);
  }
  }
 }