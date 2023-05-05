import java.util.*;
public class Main{
 public static void main(String []args){
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int k = input.nextInt();
  int counter=0;
  for(int i = 0 ; i < n;i++){
   int y = input.nextInt();
   if((5-y)>=k){
    counter++;
    }
   } 
    System.out.println((int)(counter/3));
  }
}