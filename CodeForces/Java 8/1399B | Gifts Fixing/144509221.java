import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
   long moves = 0 ;
   int n = input.nextInt();
   int [] a = new int [n]; 
   a[0] = input.nextInt();
   int mina = a[0];
   for(int j= 1 ; j < n ; j++){
    a[j] = input.nextInt();
    if(a[j] < mina){
     mina = a[j];
    }
   }
     int [] b = new int [n]; 
   b[0] = input.nextInt();
   int minb = b[0];
   for(int j= 1 ; j < n ; j++){
    b[j] = input.nextInt();
    if(b[j] < minb){
     minb = b[j];
    }
   }
   for(int j =0 ; j < n ;j++ ){
     if((a[j]-mina) > (b[j]-minb) ){
    moves += (a[j]-mina);
   
       
     }
     else{
      moves += (b[j]-minb);
     }
   
   }
   System.out.println(moves);
 
  }
 }
}