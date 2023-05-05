import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
   int n = input.nextInt();
   int m = input.nextInt();
    int counter = 0 ;
   for(int i = 1 ; i <= n ;i++){
        for(int j = 1 ; j <= m ; j++){
      if(i%2 == 1 ){
        System.out.printf("#");
      }
      else{
        if((counter/2)%2 == 0 ){
          if(j != m)
           System.out.printf(".");
           else
           System.out.printf("#");
        }
        else if((counter/2)%2 != 0){
           if(j == 1)
           System.out.printf("#");
           else
           System.out.printf(".");
          }
        }
      }
      counter++;
      System.out.println();
   }
 
   
  }
}