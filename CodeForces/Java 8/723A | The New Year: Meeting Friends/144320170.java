import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int [] a = new int [3];
  for(int i = 0 ; i < 3 ; i++){
   a[i] = input.nextInt();
  }
  Arrays.sort(a);
  System.out.println((a[2]-a[1])+(a[1]-a[0]));
 }
}