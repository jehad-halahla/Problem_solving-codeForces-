import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  
  for (int i = 0; i < t; i++) {
   int uniqueCount = 0 ;
   int n = input.nextInt();
   String str =  input.next();
   String uniqueStr = "";
      for(int j = 0 ; j < n ; j++) {
       if(!uniqueStr.contains("" + str.charAt(j))) {
        uniqueCount++;
        uniqueStr = uniqueStr.concat(""+str.charAt(j));
       }
      }
      System.out.println(uniqueCount + n);
  }
 }
}