import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
  int n = input.nextInt();
    int [] a  = new int [n*2];
  for(int j =0 ; j < (n*2) ; j++){
  a[j] = 0;
  int x = input.nextInt();
  boolean exists = false;
  for(int k =0 ; k<j ; k++){
    if(x == a[k]){
      exists = true;
      break;
       }
      }
      if(!exists)
      a[j]=x;
    }
    for(int j = 0 ; j < n*2 ; j++){
      if(a[j]!=0)
      System.out.print(a[j]+" ");
    }
    System.out.println();
 
  }
 }
}