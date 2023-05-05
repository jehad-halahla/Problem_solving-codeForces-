import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
  int n = input.nextInt();
  int sum = input.nextInt();
  if(n>=3){
    System.out.println(sum*2);
  }
  else if (n==2){
        System.out.println(sum);
  }
  else{
     System.out.println(0);
 
  }
 
  }
  
 }
}