import java.math.BigInteger;
import java.util.*;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  ArrayList<BigInteger> arraylist = new ArrayList<BigInteger>();
  int counter = 0;
  for (int i = 0; i < 4; i++)
   arraylist.add(new BigInteger(input.next()));
  for (int i = 0; i < 4; i++) {
   for (int j = i + 1; j < arraylist.size(); j++) {
    if (arraylist.get(i).equals(arraylist.get(j))) {
     counter++;
     arraylist.remove(j);
     j--;
     }
     
 
   }
  }
  System.out.println(counter);
 }
}