import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for(int i = 0 ; i < n ; i++){
      boolean flag = true;
      String str = input.next();
      if(str.length() == 1)
        flag = false;
      if(str.length() == 2 && str.charAt(0)!=str.charAt(1))
        flag = false;
      for(int j = 1 ; j < str.length()-1;j++){
        if(str.charAt(j)!=str.charAt(j+1) && str.charAt(j)!=str.charAt(j-1) ){
          flag = false;
          break;
        }
        if(str.charAt(0)!= str.charAt(1) || str.charAt(str.length()-1) !=str.charAt(str.length()-2))
        flag = false;
      }
      if(flag)
      System.out.println("YES");
      else
      System.out.println("NO");
      
    }
    
 
    
  }
}