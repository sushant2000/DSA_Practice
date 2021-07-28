
import java.util.Scanner;
public class conversion {
    public static Scanner scn = new Scanner(System.in);

 private static int digit_frequency(int num , int digit){
      int count = 0;
      while(num>0){
          int d = num%10;
          num = num/10;
          if(d==digit){
              count++;
          }
      }
return count;
 }

 private static long decimalToAnyBase(int num , int base){
     long ans = 0, p = 1;
     while(num>0){
         int rem = num % base;
         num = num / base;

         ans = rem * p + ans;
         p = p*10;
     }
     return ans;
 }
    public static void main(String[] args){
  int n = scn.nextInt();
  int d = scn.nextInt();
 // int freq = digit_frequency(n, d);
  long freq = decimalToAnyBase(n, d);
  System.out.println(freq); 
    }
    
}
