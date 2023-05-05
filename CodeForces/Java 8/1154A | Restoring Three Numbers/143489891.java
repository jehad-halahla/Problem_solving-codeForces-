import java.util.*;
public class Main{
 public static void main(String []args){
  Scanner input = new Scanner(System.in);
  int [] a = new int [4];
  a[0] = input.nextInt();
  int max = a[0] ;
  int index=0;
  for(int i = 1 ; i < 4; i++){
    a[i]=input.nextInt();
   if(a[i]>max ){
    max = a[i];
    index= i;
   }
  }
  int temp = a[index];
  a[index] = a[3];
   a[3] = temp;
   System.out.println((a[3]-a[2])+" "+(a[3]-a[1])+" "+ (a[3]-a[0]));
  }
 }