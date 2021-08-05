import java.util.Scanner;
class strings{
public static Scanner scn = new Scanner(System.in);

public static String compression1(String str){ // Running Compression
   StringBuilder sb = new StringBuilder(); 
  if(str.length() == 0) return "";
  char prevChar = str.charAt(0);
  int i = 1;
  while(i <= str.length()){
   int count = 1;
   while(i<str.length() && prevChar == str.charAt(i)){
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


public static void main(String args[]){
String str = scn.nextLine();
String str1 = compression1(str);
String str2 = compression2(str);
System.out.println(str1);
System.out.println();
System.out.println(str2);
 }
}