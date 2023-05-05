import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for(int i = 0 ; i < n ; i++){
      String str = input.next();
      String word = input.next();
      int sum = 0 ;
      for(int  j = 0 ; j < word.length()-1;j++){
        sum +=(int)Math.abs(str.indexOf(word.charAt(j))-str.indexOf(word.charAt(j+1)));
      }
      System.out.println(sum);
    }
 
    
  }
}