import java.util.*;
public class Main{
 public static void main(String []args){
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  
  
   for(int i=0;i < n ; i ++ ){
     int x =input.nextInt();
    if((x/2)%2!=0 || x==2){
   System.out.println("NO");
  }
  else{
     System.out.println("YES");
    int []a = new int[x];
    for(int j = 0 ; j <x/2 ;j++){
     a[j] = 2*(j)+2;
     a[(x/2)+j] = (2*j)+1;
    }
      for(int j = 0 ; j < a.length ;j++){
       if(j!= a.length-1)
       System.out.print(a[j] + " ");
      else
       System.out.println(a[j]+(x/2));
    }
   }
  
  }
  
 }
}