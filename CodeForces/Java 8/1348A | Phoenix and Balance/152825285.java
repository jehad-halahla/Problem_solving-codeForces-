import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   int t = input.nextInt();
   for(int i = 0 ; i < t ; i++){
     int n = input.nextInt();
     int sum1 = (int)Math.pow(2,n) ,sum2 = 0;
     for(int j = 1 ; j < n/2 ; j++)
     sum1+=(int)Math.pow(2,j);
      for(int j = n/2 ; j < n ; j++)
     sum2+=(int)Math.pow(2,j);
    System.out.println(Math.abs(sum1 -sum2));
   }
    
  }
}