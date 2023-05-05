import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
    int k  = input.nextInt();
    int counter=k;
    int result = 0 ;
    while(counter != 0 ){
      result++;
      if(!(result%3==0 || result%10 ==3))
      counter--;
    }
    System.out.println(result);
    }
  }
 }
  