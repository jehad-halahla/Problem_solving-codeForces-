import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int r = input.nextInt();
  int b = input.nextInt();
  if(r>b){
   System.out.println(b+" "+((r-b)/2));
  }
  else{
   System.out.println(r+" "+((b-r)/2));
  }
 }
}