import java.util.Scanner;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  boolean hard = false;
for(int i  = 0 ;  i  <  n ; i ++){
 int x = input.nextInt();
 if(x != 0){
  hard=true;
  break;
 }
 
} 
 if(hard)
  System.out.println("HARD");
 else 
  System.out.println("EASY");
 }
}