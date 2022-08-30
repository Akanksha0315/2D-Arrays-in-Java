/* Program to check if a number entered by user is an Evil number or not
 * Evil Number - is a non-negative number that has an even number of 1s in its binary expansion
  Eg. 3
   The binary expansion of 3 is 11. There are even number of 1's in this expansion */
import java.io.*; //importing java.io package
class Evil //start of class
{
   public static void main(String args [])throws IOException //start of main method
   {
      int num = 0, rem = 0, digit = 0, t = 0, count = 0; 
      int binaryeq = 0;
      //initializing variables
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number to check if it is an Evil Number or not");
      num = Integer.parseInt(br.readLine());
      //taking input from user
      for(int i = num; i > 0; i = i/2) //converting decimal form to binary form
      {
         rem = i % 2; //finding remainder after dividing number by 2
         binaryeq = binaryeq + (int)(rem * Math.pow(10,t)); 
         //calculating binary equivalent of number entered by user
         t++; 
       }//end of for loop
      for(int i = binaryeq; i > 0; i = i / 10) //counting the number of 1's in binary equivalent
      {
         digit = i % 10; // extracting digit from binary equivalent
         if(digit == 1) //comparing extracted value to '1' 
         {
            count++; //incrementing when '1' is found in binary equivalent 
          }//end of if statement 
       }//end of for loop
      System.out.println(" ");
      System.out.println("INPUT: "  + num);
      System.out.println("BINARY EQUIVALENT: " + binaryeq);
      System.out.println("NO. OF 1's: " + count);
      if((count % 2) == 0)//condition for Evil Number
      {
         System.out.println(num + " is an Evil Number");
       }
      else
      {
         System.out.println(num + " is NOT an Evil Number");
       }//end of if-else statement
      //displaying required information       
      System.out.println("");
    }//end of main method
}//end of class
/** VDT
 VARIABLE    DATATYPE                DESCRIPTION
 
   num         int             to take input from user        
   rem         int                 to store value    
    t          int        temporary variable (for increment)     
  count        int              to count number of 1's          
  digit        int                to extract digits     
 binaryeq     double  to store binary equivalent of number entered 
    i          int           control vaiable to run loop
    
 */
