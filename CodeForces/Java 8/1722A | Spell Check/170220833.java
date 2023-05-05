import java.util.*;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ;i < t ; i++){
    int n = input.nextInt();
     String str = input.next();
    char [] a = str.toCharArray();
     Arrays.sort(a);
     String res = new String(a);
     if(res.compareTo("Timru") == 0)
      System.out.println("YES");
     else
      System.out.println("NO");
  }
  
   
  }
}