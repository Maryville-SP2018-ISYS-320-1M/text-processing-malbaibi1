/*
ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018 
*/

/*
 Your expected results after the input is provided:
 
 1. efg              // correct
 2. nopqrs           // correct
 3. "nothing"        // correct
 4. qr               // correct
  
 */
public class P1_CharForLoopOutput {

 public static void main(String[] args) {
  // put your call to printRange below here
   printRange('q', 'r' );

 }
 
 public static void printRange(char startLetter, char endLetter ) {
  for( char letter = startLetter; letter <= endLetter; letter++ ) {
   System.out.print( letter );
  }
  
  System.out.println();
 }

}