import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int [] a = new int [2];
  for(int i = 0 ; i < 2 ; i++){
   a[i] = input.nextInt();
  }
  Arrays.sort(a);
  int res = 6-(a[1]-1);
  if(res == 0)
   System.out.println("0/1");
  else if(res == 1)
   System.out.println("1/6");
  else if(res == 2)
   System.out.println("1/3");
  else if(res == 3)
   System.out.println("1/2");
  else if(res == 4)
   System.out.println("2/3");
  else if(res == 5)
   System.out.println("5/6");
  else
   System.out.println("1/1");
    }
 }
 