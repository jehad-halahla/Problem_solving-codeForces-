import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int [] a = new int[n];
  int counter1 = 0 ;
  int counter2 = 0 ;
  int i1 = 0;
  int i2 = n-1;
  for(int i = 0 ; i < n ; i++)
  a[i] = input.nextInt();
  
  for(int i = 0 ; i < n ; i++){
   int selected = a[i1];
   if( a[i2] > a[i1]){
            selected = a[i2];
            i2--;
   }
   else{
    i1++;
   }
   if(i%2==0)
    counter1+= selected;
   else
    counter2+= selected;
  }
  System.out.println(counter1 + " " + counter2);
 }
}