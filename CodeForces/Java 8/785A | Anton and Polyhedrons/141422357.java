import java.util.Scanner;
public class Main{
 public static void main(String [] args){
  Scanner in = new Scanner(System.in);
  int [] a = {4,6,8,12,20};
  int sum = 0; 
  int n =in.nextInt();
  for(int i = 0 ; i < n ; i++){
   String str = in.next();
   if(str.equals("Tetrahedron"))
    sum+=a[0];
    else if(str.equals("Cube"))
     sum+=a[1];
     else if(str.equals("Octahedron"))
      sum+=a[2];
      else if(str.equals("Dodecahedron"))
       sum+=a[3];
       else
        sum+=a[4]; 
  }
System.out.println(sum);
  }
 }