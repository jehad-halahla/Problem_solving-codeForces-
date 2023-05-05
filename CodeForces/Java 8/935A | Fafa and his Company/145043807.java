import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int counter = 0 ; 
  for(int i = 1 ; i < n ; i++){
   if(n%i==0)
    counter++; 
  }
  System.out.println(counter);
 }
}