/*
ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018 
*/

import java.util.Scanner;

public class VowelFinder  {

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in );
  
  System.out.print("Enter the sentence");
  String str = input.nextLine();
  
  String[] words=str.split("\\s"); 
  String word = "";
  int pn=0;
  
  for(String w:words){
    int n = countVowels(w);
     if (n >= pn){
     word= w;
     pn = n;
   }
  } 
  
  System.out.printf("The word with most vowels \"%s\".\n", word );
 }
      public static int countVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}