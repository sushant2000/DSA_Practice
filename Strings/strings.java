import java.util.Scanner;
class strings{
public static Scanner scn = new Scanner(System.in);

public static String compression1(String str){ // Running Compression
   StringBuilder sb = new StringBuilder(); 
  if(str.length() == 0) return "";
  char prevChar = str.charAt(0);
  int i = 1;
  while(i <= str.length()){  // handle last two diff characters in String
   int count = 1;  
   while(i<str.length() && prevChar == str.charAt(i)){  // genral condition
       count++;
     prevChar = str.charAt(i);
     i++;
   }
   sb.append(prevChar);
   sb.append(count);

   if(i == str.length()) break;
   
   prevChar = str.charAt(i);
   i++;
 }
 return sb.toString();

}

//===============================================================================================================


 public static String compression2(String str){ // Running length encoding compression
StringBuilder sb = new StringBuilder();

if(str.length() == 0) return "";

int[] freq = new int [26];
for(int i = 0; i<str.length(); i++){
    freq[str.charAt(i) - 'a']++;
}
 for(int i = 0; i<str.length(); i++){
     if(freq[i] > 0){
         sb.append((char)(i + 'a'));
         sb.append(freq[i]);
     }
 }
 return sb.toString();
}


//=========================================================================================

public static String toggleString(String str){
    StringBuilder sb = new StringBuilder();
    if(str.length()==0) return "";

    for(int i = 0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch >= 'a' && ch <= 'z'){
            sb.append((char)(ch + 'A' - 'a'));
        }else
            sb.append((char)(ch + 'a' - 'A'));
    }
    return sb.toString();
}
 //==============================================================================================

  public static boolean isPalindrome(String str){
      int i = 0 , j = str.length()-1;
      while(i<j){
          if(str.charAt(i++) != str.charAt(j--)) return false;
      }
      return true;
  }


public static void substringPalindrome(String str){
    for(int i = 0; i<str.length(); i++){
        for(int j = i; j<str.length(); j++){
            String s = str.substring(i,j+1);
            if(isPalindrome(s)) System.out.println(s);
        }
    }
}

//===========================================================================================

   public static String consecutiveStringDiff( String str){
       StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);


            sb.append(prev-curr);
            sb.append(curr); 
        }
        return sb.toString();
   }




 //=================MAIN FUNCTION============================================================
public static void main(String args[]){
String str = scn.nextLine();
//String str1 = compression1(str);
//String str2 = compression2(str);
//String str3 = toggleString(str);
//substringPalindrome(str);
String str4 = consecutiveStringDiff(str);

//System.out.println(str1);
//System.out.println();
//System.out.println(str2);
//System.out.println();
//System.out.println(str3);

System.out.println(str4);
 }
}