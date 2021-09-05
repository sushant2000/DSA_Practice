    import java.util.Scanner;
public class anybasesubtraction{
    public static Scanner scn = new Scanner(System.in);

private static int anybasesubtraction(int n1 , int n2 , int base){
    int ans = 0, borrow = 0, pow = 1;
    while(n1!=0 || n2!=0){
        int r1 = n1 % 10;
        int r2 = n2 % 10;

        n1/= 10;
        n2/= 10;

        int diff = r1 - r2 + borrow;
        if(diff<0){
            diff+= base;
            borrow = -1;
        }else{
            borrow = 0;
        }
        ans += diff * pow;
       pow*=10;
    }
    return ans;
}




   public static void main(String[] args){
      int n = scn.nextInt(); // num2
      int m = scn.nextInt(); // num2
      int b = scn.nextInt(); //base

      int res = anybasesubtraction(n,m,b);
      System.out.println(res);
    }
}