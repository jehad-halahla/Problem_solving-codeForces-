import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
   int n = input.nextInt();
   int length = (""+n).length();
   int counter = (length-1)*9 ;
   int a [] = new int [length];
   int x = n;
   for(int j =0 ; j < length ;j++){
    a[j] = x%10;
    x/=10;
   }
   counter += (a[length-1]-1);
   int y = 0;
   for(int j = 0 ;j < length ; j++){
     y+=a[length-1]*(Math.pow(10,j));
   }
   if(n>=y)
   counter++;
      System.out.println(counter);
 
    }
    }
 }
 