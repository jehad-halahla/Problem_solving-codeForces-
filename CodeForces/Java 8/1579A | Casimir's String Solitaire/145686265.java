import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
   String str = input.next();
   int counter = 0 ;
   for(int j = 0 ; j < str.length(); j++){
    if(str.charAt(j) == 'B')
     counter++;
   }
   if(counter*2 != str.length() || str.length() < 2 )
    System.out.println("NO");
   else 
        System.out.println("YES");
  }
 } 
} 