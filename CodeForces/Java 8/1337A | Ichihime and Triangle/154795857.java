import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for(int i = 0 ; i < n ; i++){
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
    System.out.println(Math.max(a,b) + " " + Math.max(b,c)+ " " + Math.min(c,d) );
    }
 
    
  }
}