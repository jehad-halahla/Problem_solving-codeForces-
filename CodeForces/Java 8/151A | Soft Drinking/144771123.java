import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int k = input.nextInt();
  int l = input.nextInt();
  int c = input.nextInt();
  int d = input.nextInt();
  int p = input.nextInt();
  int nl = input.nextInt();
  int np = input.nextInt();
  int [] a = new int[3];
  a[0] = (int)((k*l)/nl);
  a[1] = (int)(c*d);
  a[2] = (int)(p/np);
  Arrays.sort(a);
  System.out.println((int)(a[0]/n));
 }
}