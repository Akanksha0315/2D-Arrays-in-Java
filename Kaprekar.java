/* Program to find all Kaprekar numbers in a range entered by user
 * Kaprekar Number - A number whose square when divided into two parts and such that sum 
  of parts is equal to the original number and none of the parts has value 0
  Eg. 9
   9^2 = 81
   8 + 1 = 9
 */
import java.io.*; //importing java.io package
class Kaprekar //start of class
{
   public static void main(String args[])throws IOException //start of main method
   {
      int p = 0, q = 0, max = 0, min = 0, sq = 0, count = 0, temp = 0;
      int first_half = 0, second_half = 0, sum = 0, freq = 0;
      //initializing variables
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter 2 positive numbers to determine the range");
      p = Integer.parseInt(br.readLine());
      q = Integer.parseInt(br.readLine());
      //taking input from user for desired range
      if(p >  q) //distinguishing the maximum and minimum value of the range  
      {
         max = p;
         min = q;
        }
      else
      {
         max = q;
         min = p; 
        }//end of if-else statement
      System.out.println("THE KAREKAR NUMBERS ARE: ");
      for(int i = min; i <= max; i++)
      {
         sq = 0;
         count = 0;
         sq = i*i; //squaring the number
         for(int j = sq; j > 0; j = j/10)
         {
            count++; //counting the number of digits
          }//end of for loop
         temp = count/2;
         if(count%2 != 0) //for case when number of digits is odd
         {
            temp = temp + 1; 
          } //end of if statement
         first_half = sq / (int)(Math.pow(10,temp));
         second_half = sq % (int)(Math.pow(10,temp));
         //forming the two halves to be added as per required condition
         sum = first_half + second_half; //calculating sum
         if(sum == i)
         {
            System.out.println(i); //displaying all Kaprekar numbers in range
            freq++; //calculating frequenct 
         }//end of if statement
       }//end of for loop
      System.out.println("THE FRQUENCY OF KAPREKAR NUMBERS IS: " + freq); 
      //displaying frequency of Kaprekar numbers as per range entered by user
    }//end of main method
}//end of class
/**VDT
 VARIABLE    DATATYPE             DESCRIPTION
    p          int          to take input from user 
    q          int          to take input from user 
   max         int          to store greater value 
   min         int          to store smaller value
   sq          int         to store square of number
  count        int         to store number of digits
  temp         int        to determine the two halves 
first_half     int       to store first half of number  
second_half    int       to store second half of number
   sum         int       to calculate sum of two halves
  freq         int    to find the frequency in given range
    i          int        control variable to run loop 
    j          int        control variable to run loop 
 */
