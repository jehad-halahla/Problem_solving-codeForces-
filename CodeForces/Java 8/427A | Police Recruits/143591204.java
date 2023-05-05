import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int counter=0;
  int solved = 0;
  int cases=0;
  for(int i = 0 ; i < n ; i++){
   int x=input.nextInt();
   if(x<0){
     cases++;
   }
   if(x<0 && counter>0){
   counter--;
   solved++;
   }
   if(x>0){
    counter+=x;
   }
    
  }
   System.out.println(cases-solved);
 }
   
}