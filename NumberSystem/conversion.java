
import java.util.Scanner;
public class conversion {
    public static Scanner scn = new Scanner(System.in);

 private static int digit_frequency(int num , int digit){
      int count = 0;
      while(num>0){
          long d = num%10;
          num = num/10;
          if(d==digit){
              count++;
          }
      }
return count;
 }

 private static long decimalToAnyBase(long num , int base){
     long ans = 0, p = 1;
     while(num>0){
         long rem = num % base;
         num = num / base;

         ans = rem * p + ans;
         p = p*10;
     }
     return ans;
 }


private static long anyBaseTodecimal(long num , int base){
    long ans = 0 , p = 1;
    while(num>0){
        long dig = num % 10;
        num = num/10;

        ans = ans + dig*p;
        p = p*base;
    }
    return ans;
}

private static long anyBaseToAnyBase(int num , int given_base , int req_base){
    
   long temp = anyBaseTodecimal(num , given_base);
   long ans = decimalToAnyBase(temp , req_base); 
    return ans;
}



public static void main(String[] args){
  int n = scn.nextInt();
  int b1 = scn.nextInt();
  int b2 = scn.nextInt();
 // int freq = digit_frequency(n, d);
  //long freq = decimalToAnyBase(n, b);
  // long freq = anyBaseTodecimal(n, b);
   long freq = anyBaseToAnyBase(n, b1 , b2);
  System.out.println(freq); 

    }
    
}
