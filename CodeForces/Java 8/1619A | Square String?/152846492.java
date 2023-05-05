import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   int t = input.nextInt();
   for(int i = 0 ; i < t ; i++){
   String str = input.next();
   char [] a  = str.toCharArray();
   if(a.length%2 != 0)
     System.out.println("NO");
     
   else{
     boolean isGood = true;
     for(int j = 0 ; j < a.length/2 ;  j++){
       if(a[j] != a[(a.length/2)+j]){
           isGood = false ;
          break;
       }
     }
     if(isGood)
      System.out.println("YES");
     else 
      System.out.println("NO");
 
   }
    }
  }
}