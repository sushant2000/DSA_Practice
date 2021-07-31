import java.util.Scanner;
public class anybaseaddition{
    public static Scanner scn = new Scanner(System.in);

private static int binaryaddition(int num1 , int num2){
    int res = 0, carry = 0, pow = 1;
    while(num1!=0 || num2!=0 || carry!=0){

        int r1 = num1 % 10;
        int r2 = num2 % 10;
        
        num1/= 10;
        num2/= 10;

        int sum = r1 + r2 + carry;
        int d = sum % 2;
        carry = sum / 2;

        res += d * pow;
        pow*= 10;

    }
    return res;
}

private static int anybaseaddition(int num1 , int num2 , int base){
    int res = 0, carry = 0, pow = 1;
    while(num1!=0 || num2!=0 || carry!=0){

        int r1 = num1 % 10;
        int r2 = num2 % 10;
        
        num1/= 10;
        num2/= 10;

        int sum = r1 + r2 + carry;
        int d = sum % base;
        carry = sum / base;

        res += d * pow;
        pow*= 10;

    }
    return res;
}




public static void main(String[] args){
int n = scn.nextInt(); // num2
int m = scn.nextInt(); // num2
int b = scn.nextInt(); //base

//int ans = binaryaddition(n,m);
int ans2 = anybaseaddition(n,m,b);
//System.out.println(ans);
System.out.println(ans2);
}

}