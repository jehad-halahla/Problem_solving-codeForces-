import java.util.*;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ;i < t ; i++){
   int n = input.nextInt();
   String str1 = input.next();
   String str2 = input.next();
   boolean isIdentical = true;
   for(int j = 0 ; j < n;j++) {
    if((str1.charAt(j) == 'R' && (str2.charAt(j) == 'G' || str2.charAt(j) == 'B'))||(str2.charAt(j) == 'R' && (str1.charAt(j) == 'G' || str1.charAt(j) == 'B'))) {
     isIdentical = false;
    }
   }
   if(isIdentical)
    System.out.println("YES");
   else
    System.out.println("NO");
  }
  
   
  }
}