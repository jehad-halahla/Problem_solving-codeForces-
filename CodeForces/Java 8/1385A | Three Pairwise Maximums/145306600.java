import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t  ; i++){
   int [] a  = new int [3] ;
   for(int j = 0 ; j < 3 ; j++)
    a[j] = input.nextInt();
   Arrays.sort(a);
   if(a[0] == a[1] && a[1] == a[2] && a[0] == a[2]){
    System.out.println("YES");
    System.out.println(a[0] +" "+ a[1] + " " + a[2] );
   }
   else if(a[0] < a[1] && a[1] == a[2]){
    System.out.println("YES");
    if(a[0] == 1 )
    System.out.println(a[0] +" "+ a[0] + " " + a[2] );
    else
    System.out.println(a[2] +" "+ a[0] + " " + (a[0]-1) );
   }
   else{
     System.out.println("NO");
   }
       
 
   
  }
 }
}