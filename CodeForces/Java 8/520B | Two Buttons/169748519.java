import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
 int  n = input.nextInt();
 int m = input.nextInt();
 int counter= 0 ;
  if(n < m){
    while(m  > n){
      if(m%2 == 1){
        m++;
        counter++;
    
      }
      else{
              m = m/2;
              counter++;
        }
      }
            System.out.println((n-m)  + counter);
 
    }
    else
      System.out.println(n-m);
  }
}