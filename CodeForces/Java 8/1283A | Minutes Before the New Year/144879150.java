import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i =0 ; i < t ; i++){
   int [] a = new int[2];
   for(int j = 0 ; j < 2 ; j ++){
    a[j]  =input.nextInt();
    }
    System.out.println((23-a[0])*60 + 60-a[1]);
   }
  }
 }
 