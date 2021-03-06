import java.util.Scanner;
import java.util.ArrayList;
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

//===========================================================================================

public static ArrayList <String>  permutation_String(String str){
    ArrayList <String> ans = new ArrayList<>();
    ans.add(str.charAt(0) + "");

    for(int i = 1; i<str.length(); i++){
        char ch = str.charAt(i);
        ArrayList <String> temp = new ArrayList<>();
        for(String s : ans){
            for(int j = 0; j<= s.length(); j++){
                String res = s.substring(0,j) + ch + s.substring(j);
                temp.add(res);
            }
        }
        ans = temp;
    }
    return ans;
}

public static void display(ArrayList<String> list){
    for(String elm : list){
        System.out.println(elm);
    }
}


//===========================================================================================

public static void printAllSubstring(String str){
    for(int i = 0; i<str.length(); i++){        //O(n)
        for(int j = i; j<str.length(); j++){     //O(n)
            String s = str.substring(i,j+1);     //O(n)
            System.out.println(s);
        }  //total O(n3)
    }
}

//=============================Question=====================================================
//input mein se first two places se x remove karke print karna h string

public static String removeX(String str){
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i<str.length(); i++){
       char ch = str.charAt(i);
       if(i < 2 && str.charAt(i)!= 'x'){
           sb.append(str.charAt(i));
       }if(i>=2){
           sb.append(str.charAt(i));
       }
}
    return sb.toString();
}

//==============================Leetcode 541=================================================
public static void stringSwap(char[] arr , int i , int j){
  while(i < j){
    char ch = arr[i];
    arr[i] = arr[j];
    arr[j] = ch;

    i++;
    j--;
  }
}

public static Stirng reverseString(Stirng s , int k ){
    if(k == 0 || k == 1 || s.length()<=1) return s;

    int i = 0 , n = s.length();
    char[] arr = s.toCharArray();
    while(i < n){
        if(i + k - 1 < n){
            stringSwap(arr , i , i + k -1);
            i+= 2 * k;
        }else{
            stringSwap(arr , i , n-1);  //when left elements are less than k
            break;
        }
    }



    return new String(arr);
}




































 //=================MAIN FUNCTION============================================================
public static void main(String args[]){
int t = scn.nextInt();    
scn.nextLine();
//String str1 = compression1(str);
//String str2 = compression2(str);
//String str3 = toggleString(str);
//substringPalindrome(str);
//String str4 = consecutiveStringDiff(str);

//System.out.println(str1);
//System.out.println();
//System.out.println(str2);
//System.out.println();
//System.out.println(str3);

//ArrayList<String> final_ans = permutation_String(str);
//display(final_ans);

while(t-- > 0){
String str = scn.nextLine();
String s = removeX(str);
System.out.println(s);
}
 }
}