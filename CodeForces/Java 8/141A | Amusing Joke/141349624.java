 
import java.util.*;
 
public class Main {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  String str1 = in.next();
  str1 = str1 + in.next();
  String str2 = in.next();
  char[] a = str1.toCharArray();
  char[] b = str2.toCharArray();
  Arrays.sort(a);
  Arrays.sort(b);
  String str1sorted = new String(a);
  String str2sorted = new String (b);
  if (str1sorted.equals(str2sorted))
   System.out.println("YES");
  else
   System.out.println("NO");
 
 }
}