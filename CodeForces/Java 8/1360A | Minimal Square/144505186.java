import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
    int [] a = new int [2];
    a[0] = input.nextInt();
    a[1] = input.nextInt();
    if(a[0] > a[1]){
      int temp = a[0];
      a[0] = a[1];
      a[1] = temp;
    }
    if((a[0]*2) > a[1] ){
      System.out.println((a[0]*2)*(a[0]*2));
    }
    else
      System.out.println(a[1]*a[1]);
 
  }
 }
}