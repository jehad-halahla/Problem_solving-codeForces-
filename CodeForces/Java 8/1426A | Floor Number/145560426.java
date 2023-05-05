import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0  ; i < t ; i++){
   int n = input.nextInt();
   int x = input.nextInt();
    int counter = 1; 
    counter +=(n-2)/x;
    if((n-2)%x!= 0 )
    counter++;
    if(n <=2 )
    counter =1;
    System.out.println(counter);
    }
  }
}