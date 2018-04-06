/*
ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018 
*/

import java.util.Scanner;

public class P4_LongestInputString {

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in );
  
  System.out.print("How many words will you enter? ");
  int numOfWords = input.nextInt();
  
  String lWord = getLongestWord(input, numOfWords);
  
  String longestWord = lWord;
  System.out.printf("The longest word was \"%s\".\n", longestWord );
 }
  public static String getLongestWord(Scanner in, int n ) {
   int len = 0;
   String word = "";
   for( int i = 1; i <= n; i++ ) {
   System.out.print("Enter word " +i+ ":" );
   String str = in.next();
   int len1 = str.length( );
   if (len1>=len){
     word= str;
     len=len1;
   }
   
  }
  return word;
 }
}