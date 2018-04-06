import java.util.Scanner;

/*
ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018 
*/

/* 2. Your pseudocode algorithm in here
 
 1.input a string.
 2.input a charcter to be count.
 3.use a for loop to find the given charcter in string
 4.if find incremnt each time
 5.print the result on console
 
 */


public class P2_CountAllEs {

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in );
        System.out.println("Enter a String");
        String str = input.nextLine().toLowerCase();
        System.out.println("Enter a character to count in the string " + str);
        char chr = input.next(".").toLowerCase().charAt(0);                     
                          
        int cnt = 0;
        for (char chr2 : str.toCharArray()) {
            if (chr == chr2) {
                cnt++;
            }
        }
        System.out.println(chr + " occurs " + cnt + " times in " + str);
        input.close();

 }

}
