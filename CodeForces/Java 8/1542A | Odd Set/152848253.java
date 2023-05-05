import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   int t = input.nextInt();
   for(int i = 0 ; i < t ; i++){
     int n = input.nextInt();
     int evenCounter = 0;
     int oddCounter = 0;
     for(int j = 0 ;j < 2*n ; j++ ){
       int x = input.nextInt();
       if(x%2 ==0)
       evenCounter++;
       else
       oddCounter++;
     }
     if(oddCounter == evenCounter)
       System.out.println("Yes");
     else
      System.out.println("No");
 
     
    }
  }
}