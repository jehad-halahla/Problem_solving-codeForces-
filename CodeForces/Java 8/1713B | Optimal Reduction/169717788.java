import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for (int i = 0; i < t; i++) {
    int n = input.nextInt();
    int [] a = new int [n] ;
    for(int j =0 ; j < n;j++)
    a[j] = input.nextInt();
    int asc = 1;//a number is consedered sorted in non-dec order if its a se t of 1 
    int desc =1 ;
   while(asc < n && a[asc-1] <= a[asc])
   asc++;
      while(desc < n && a[n -(desc)] <= a[n-(desc+1)])
   desc++;
    if(desc + asc >= n)
  System.out.println("YES");
  else
      System.out.println("NO");
 
    
  }
 
  
 
}
}